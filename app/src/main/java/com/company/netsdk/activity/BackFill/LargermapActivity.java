package com.company.netsdk.activity.BackFill;

import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.CameraUpdateFactory;
import com.amap.api.maps2d.MapView;
import com.amap.api.maps2d.model.CameraPosition;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.Marker;
import com.amap.api.maps2d.model.MarkerOptions;
import com.amap.api.maps2d.model.Polyline;
import com.amap.api.maps2d.model.PolylineOptions;
import com.company.netsdk.R;
import com.company.netsdk.module.server_adress;
import com.company.netsdk.module.tr_ids;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static android.content.ContentValues.TAG;

public class LargermapActivity extends Activity implements View.OnClickListener {
    private AMap aMap;
    private MapView mapView;
    private TextView largermap_return,largermap_title;
    Polyline polyline,polyline_alert;
    Marker marker;
    boolean isfirsttime=true;
    Thread t;
    String sid= tr_ids.sid,tid=tr_ids.tid,key=tr_ids.key,trid=tr_ids.trid;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case 1:
                    Toast.makeText(LargermapActivity.this,msg.obj.toString(),Toast.LENGTH_LONG);
                    add_polylines(msg.obj.toString());
                    break;
                case 2:
                    set_gps_info(msg.obj.toString());
                    break;
                default:
                    Toast.makeText(LargermapActivity.this,msg.obj.toString(),Toast.LENGTH_LONG);
                    break;
            }
        }
    };

    Handler handler_cycletask = new Handler() {
        public void handleMessage(Message msg) {

            super.handleMessage(msg);

            requestGet(server_adress.url+"/get_gps_info",2);
        }
    };
    private void set_gps_info(String StringTemp) {
        JSONObject jsonObjectTemp = (JSONObject) JSONObject.parse(StringTemp);
        key=jsonObjectTemp.get("key").toString();
        tid=jsonObjectTemp.get("tid").toString();
        trid=jsonObjectTemp.get("trid").toString();
        sid=jsonObjectTemp.get("sid").toString();
        tr_ids.key=key;
        tr_ids.tid=tid;
        tr_ids.trid=trid;
        tr_ids.sid=sid;
        String trsearch="https://tsapi.amap.com/v1/track/terminal/trsearch?";
        if(key.length()>0){
            trsearch+="key="+key;
            if(tid.length()>0){
                trsearch+="&tid="+tid;

            }
            if(sid.length()>0){
                trsearch+="&sid="+sid;
            }
            if(trid.length()>0){
                trsearch+="&trid="+trid;
            }
            requestGet(trsearch,1);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_largermap);
        mapView=(MapView)findViewById(R.id.lagermap);
        mapView.onCreate(savedInstanceState);
        largermap_return=(TextView)findViewById(R.id.largermap_return);
        largermap_return.setOnClickListener(this);
        largermap_title=findViewById(R.id.largermap_title);
        android.view.Display display = getWindowManager().getDefaultDisplay();
        //android.view.Display display2 = this.getwi
        int y=display.getHeight();
        int x=display.getWidth();
        largermap_return.setTextSize(x/360*30/5);
        largermap_title.setTextSize(x/360*30/5);
        init();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }
    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
        t.interrupt();
    }
    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
        String trsearch="https://tsapi.amap.com/v1/track/terminal/trsearch?";
        if(key.length()>0){
            trsearch+="key="+key;
            if(tid.length()>0){
                trsearch+="&tid="+tid;

            }
            if(sid.length()>0){
                trsearch+="&sid="+sid;
            }
            if(trid.length()>0){
                trsearch+="&trid="+trid;
            }
            requestGet(trsearch,1);
        }
        t=new Thread(new MyThread());
        t.start();

    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.largermap_return:
                finish();
                break;
            default:
                break;
        }
    }
    private void init() {
        if (aMap == null) {
            aMap = mapView.getMap();

        }
    }

    private void add_polylines(String StringTemp){
        if(polyline!=null) {
            polyline.remove();
            polyline = null;
        }
        if(polyline_alert!=null) {
            polyline_alert.remove();
            polyline_alert=null;
        }
        if(marker!=null){
            marker.remove();
            marker=null;
        }
        Map<String,String> resultMap=new HashMap<>();
        JSONArray jsonResultArrayTemp;
        int i=0,j;
        JSONObject jsonObjectTemp = (JSONObject) JSONObject.parse(StringTemp);
        if(jsonObjectTemp.get("data")==null)
            return;
        jsonObjectTemp=(JSONObject)JSONObject.parse(jsonObjectTemp.get("data").toString());

        jsonResultArrayTemp=(JSONArray)JSONObject.parse(jsonObjectTemp.get("tracks").toString());
        i=Integer.parseInt(jsonResultArrayTemp.getJSONObject(0).get("counts").toString());
        jsonResultArrayTemp=(JSONArray)JSONObject.parse(jsonResultArrayTemp.getJSONObject(0).get("points").toString());

        List<LatLng> latLngs= new ArrayList<LatLng>();
        String location[];
        for(j=0;j<i;j++){
            location=jsonResultArrayTemp.getJSONObject(j).getString("location").toString().split(",");
            latLngs.add(new LatLng(Double.parseDouble(location[1]),Double.parseDouble(location[0])));

        }
        polyline =aMap.addPolyline(new PolylineOptions().
                addAll(latLngs).width(10).color(Color.argb(255, 1, 1, 200)));
        polyline_alert =aMap.addPolyline(new PolylineOptions().
                addAll(latLngs.subList(0,9)).width(10).color(Color.argb(255, 200, 1, 1)));
        marker=aMap.addMarker(new MarkerOptions().position(latLngs.get(i-1)).draggable(true));
        if (isfirsttime) {
            aMap.moveCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(latLngs.get(i - 1), 19, 0, 0)));
            isfirsttime=!isfirsttime;
        }
        else{

        }

    }
    private void requestGet(String url, final int i){
        ;
        OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder()
                .url(url)
                .get()//默认就是GET请求，可以不写
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d(TAG, "onFailure: ");
                if(i==2){
                    String trsearch="https://tsapi.amap.com/v1/track/terminal/trsearch?";
                    if(key.length()>0){
                        trsearch+="key="+key;
                        if(tid.length()>0){
                            trsearch+="&tid="+tid;

                        }
                        if(sid.length()>0){
                            trsearch+="&sid="+sid;
                        }
                        if(trid.length()>0){
                            trsearch+="&trid="+trid;
                        }
                        requestGet(trsearch,1);
                    }
                }
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Message msg=new Message();
                msg.obj=response.body().string();
                msg.what=i;
                handler.sendMessage(msg);
                Log.e(TAG, "largermapactivity Get方式请求成功，result--->" + msg.obj);
            }
        });
    }
    public class MyThread implements Runnable {
        @Override
        public void run() {
            // TODO Auto-generated method stub
            while (true) {
                try {
                    if(Thread.currentThread().isInterrupted()){
                        break;
                    }
                    Thread.sleep(1000);// 线程暂停10秒，单位毫秒
                    Message message = new Message();
                    message.what = 1;
                    handler_cycletask.sendMessage(message);// 发送消息
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    break;
                }
            }
        }
    }
}