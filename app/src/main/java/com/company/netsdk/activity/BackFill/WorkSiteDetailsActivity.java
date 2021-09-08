package com.company.netsdk.activity.BackFill;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import android.view.SurfaceHolder;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.amap.api.interfaces.MapCameraMessage;
import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.CameraUpdate;
import com.amap.api.maps2d.CameraUpdateFactory;
import com.amap.api.maps2d.MapView;
import com.amap.api.maps2d.model.CameraPosition;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.Marker;
import com.amap.api.maps2d.model.MarkerOptions;
import com.amap.api.maps2d.model.Polyline;
import com.amap.api.maps2d.model.PolylineOptions;
import com.company.netsdk.R;
import com.company.netsdk.common.DialogProgress;
import com.company.netsdk.common.StatusItemView;
import com.company.netsdk.common.ToolKits;
import com.company.netsdk.module.DeviceControlModule;
import com.company.netsdk.module.LivePreviewModule;
import com.company.netsdk.module.TalkModule;
import com.company.netsdk.module.server_adress;
import com.company.netsdk.module.tr_ids;


import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static android.content.ContentValues.TAG;

public class WorkSiteDetailsActivity extends Activity implements View.OnClickListener,SurfaceHolder.Callback{//"key=0a6cf0c398e3f925edcc3c03563aecaa&sid=383858&tid=387023588&trid=200"
    private String left_distance="--",right_distance="--",dust_level="--",obstacle="---",thickness="--",sid= tr_ids.sid,tid=tr_ids.tid,key=tr_ids.key,trid=tr_ids.trid;
    private MapView mapView;
    private AMap aMap;
    private List<Button> button_list=new ArrayList<>();
    private Button thicknessbutton,scrolltextbutton1,scrolltextbutton2;
    private VideoView video;
    private RadioGroup mRadioGroup;
    private LinearLayout map_video,navi_layout,scrollbuttonlayout;
    private TextView return_button,setting_button,work_site_title;
    private HttpURLConnection conn;
    private List<StatusItemView> statusItemViewList=new ArrayList<>();
    private Polyline polyline,polyline_alert;
    private Marker marker;
    private boolean isfirsttime=true,begin_detect_thickness=false;
    private Thread t;
    private String track_text="";
    private int previous_thickness=0;


    private SurfaceView mRealView;
    private boolean isVideoTalking = false;
    private LivePreviewModule mLiveModule;
    private TalkModule mTalkModule;
    private DialogProgress mDialogProgress;
    private DeviceControlModule mDeviceControlModule;

    private final String TAG = LivePreviewActivity.class.getSimpleName();
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case 1:
                    Toast.makeText(WorkSiteDetailsActivity.this,msg.obj.toString(),Toast.LENGTH_LONG);
                    add_polylines(msg.obj.toString());
                    break;
                case 2:
                    Toast.makeText(WorkSiteDetailsActivity.this,msg.obj.toString(),Toast.LENGTH_LONG);
                    set_distance(msg.obj.toString());
                    break;
                case 3:
                    Toast.makeText(WorkSiteDetailsActivity.this,msg.obj.toString(),Toast.LENGTH_LONG);
                    set_dust_level(msg.obj.toString());
                    break;
                case 4:
                    Toast.makeText(WorkSiteDetailsActivity.this,msg.obj.toString(),Toast.LENGTH_LONG);
                    set_gps_info(msg.obj.toString());
                    break;
                case 5:
                    Toast.makeText(WorkSiteDetailsActivity.this,msg.obj.toString(),Toast.LENGTH_LONG);
                    set_obstacle_info(msg.obj.toString());
                    break;
                case 6:
                    Toast.makeText(WorkSiteDetailsActivity.this,msg.obj.toString(),Toast.LENGTH_LONG);
                    set_thickness(msg.obj.toString());
                    break;
                default:
                    Toast.makeText(WorkSiteDetailsActivity.this,msg.obj.toString(),Toast.LENGTH_LONG);
                    break;
            }
        }
    };
    private void set_thickness(String StringTemp) {
        JSONObject jsonObjectTemp = (JSONObject) JSONObject.parse(StringTemp);
        if(begin_detect_thickness) {
            thickness=(Integer.parseInt(jsonObjectTemp.get("thickness").toString())-previous_thickness)+"";
            statusItemViewList.get(4).setText(thickness+"cm");
        }
        else{
            thickness="--";
            statusItemViewList.get(4).setText(thickness+"cm");
        }
        previous_thickness=Integer.parseInt(jsonObjectTemp.get("thickness").toString());

    }

    private void set_obstacle_info(String StringTemp) {
        JSONObject jsonObjectTemp = (JSONObject) JSONObject.parse(StringTemp);
        obstacle=jsonObjectTemp.get("obstacle").toString();
        statusItemViewList.get(3).setText(obstacle);
    }

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

    private void set_dust_level(String StringTemp) {
        JSONObject jsonObjectTemp = (JSONObject) JSONObject.parse(StringTemp);
        dust_level=jsonObjectTemp.get("dust_level").toString();
        statusItemViewList.get(2).setText(dust_level+"mg/m³");
    }

    Handler handler_cycletask = new Handler() {
        public void handleMessage(Message msg) {

            super.handleMessage(msg);
            requestGet(server_adress.url+"/get_distance_info/",2);
            requestGet(server_adress.url+"/get_dust_info/",3);
            requestGet(server_adress.url+"/get_gps_info/", 4);
            requestGet(server_adress.url+"/get_obstacle_info/",5);
            //requestGet(server_adress.url+"/thickness",6);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_site_details);
        mapView = (MapView) findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);// 此方法必须重写

        map_video=(LinearLayout)findViewById(R.id.map_video);
        return_button=(TextView)findViewById(R.id.return_button);
        setting_button=(TextView)findViewById(R.id.setting_button);
        work_site_title=(TextView)findViewById(R.id.work_site_title);
        thicknessbutton=(Button)findViewById(R.id.detect_thickness_button);
        thicknessbutton.setOnClickListener(this);
        navi_layout=(LinearLayout)findViewById(R.id.navi_layout);
        scrolltextbutton1=(Button)findViewById(R.id.scrollbutton1);
        scrolltextbutton1.setOnClickListener(this);
        scrolltextbutton2=(Button)findViewById(R.id.scrollbutton2);
        scrolltextbutton2.setOnClickListener(this);
        scrollbuttonlayout=(LinearLayout) findViewById(R.id.scrollbuttonlayout);

        mLiveModule = new LivePreviewModule(this);
        mTalkModule = new TalkModule(this);
        mDeviceControlModule = new DeviceControlModule(this);
        mDialogProgress = new DialogProgress(this);
        setupView();
        init();
    }
    private void setupView(){
        mRealView = (SurfaceView)findViewById(R.id.videoView);
        mRealView.getHolder().addCallback(this);
        mLiveModule.setOpenSound(false);
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

        /*List<LatLng> latLngs = new ArrayList<LatLng>();
        latLngs.add(new LatLng(39.900430,116.265061));
        latLngs.add(new LatLng(39.955192,116.140092));
        Polyline polyline =aMap.addPolyline(new PolylineOptions().
                addAll(latLngs).width(10).color(Color.argb(255, 255, 1, 1)));
        List<LatLng> latLngs1 = new ArrayList<LatLng>();
        latLngs1.add(new LatLng(39.900430,116.265061));
        latLngs1.add(new LatLng(39.955192,116.140092));
        aMap.addPolyline(new PolylineOptions().
                addAll(latLngs1).width(10).color(Color.argb(255, 1, 1, 255)));
        aMap.addMarker(new MarkerOptions().position(latLngs.get(0)).title("0")).setTitle("111");
        aMap.addMarker(new MarkerOptions().position(latLngs.get(1)).title("1"));
        aMap.addMarker(new MarkerOptions().position(latLngs1.get(0)).title("2"));
        aMap.addMarker(new MarkerOptions().position(latLngs1.get(1)).draggable(true).title("3"));*/
        resume();
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

    /**
     * 方法必须重写
     */

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                break;
            case R.id.button2:

                VideoTalkTask task = new VideoTalkTask();
                task.execute();
                break;
            case R.id.button3:
                startActivity(new Intent(WorkSiteDetailsActivity.this,LargermapActivity.class));
                break;
            case R.id.button4:

                break;
            case R.id.return_button:
                //startActivity(new Intent(WorkSiteDetailsActivity.this,MainActivity.class));
                finish();
                break;
            case R.id.setting_button:
                startActivity(new Intent(WorkSiteDetailsActivity.this,SettingActivity.class));
                break;
            case R.id.detect_thickness_button:
                if(thicknessbutton.getText().equals("开始回填厚度检测")) {
                    begin_detect_thickness=true;
                    thicknessbutton.setText("重置回填厚度检测");
                    statusItemViewList.get(4).setText("0cm");
                }
                else{
                    begin_detect_thickness=false;
                    thicknessbutton.setText("开始回填厚度检测");
                    statusItemViewList.get(4).setText("--cm");
                }
                break;
        }

    }
    /**
     * 初始化AMap对象
     */
    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
        t.interrupt();
    }
    private void init_button(Button button,int index){
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int x = point.x;
        int y = point.y;
        ViewGroup.LayoutParams lp =null;
        button_list.get(index).setOnClickListener(this);
        lp =button_list.get(index).getLayoutParams();
        lp.width=x/360*60;
        lp.height=lp.width*5/16*9/2;
        //button_list.get(0).setTextSize(x/360*60/10);
        button_list.get(index).setLayoutParams(lp);
    }
    private  void init_status_item(int x,int y){
        int h=(y-x/360*300/16*9*2)/7;
        int textsize=x/360*300/16*9/10,imgsize=x/360*300/16*9/10,space=h/4,buttonheight=h;
        statusItemViewList.add((StatusItemView)findViewById(R.id.item1));
        statusItemViewList.get(0).setText("左侧距离:",left_distance+"cm",textsize);
        statusItemViewList.get(0).setStatusimg(imgsize);
        statusItemViewList.get(0).setstatussize(h);
        statusItemViewList.add((StatusItemView)findViewById(R.id.item2));
        statusItemViewList.get(1).setText("右侧距离:",right_distance+"cm",textsize);
        statusItemViewList.get(1).setStatusimg(imgsize);
        statusItemViewList.get(1).setstatussize(h);
        statusItemViewList.add((StatusItemView)findViewById(R.id.item3));
        statusItemViewList.get(2).setText("扬尘浓度:",dust_level+"mg/m³",textsize);
        statusItemViewList.get(2).setStatusimg(imgsize);
        statusItemViewList.get(2).setstatussize(h);
        statusItemViewList.add((StatusItemView)findViewById(R.id.item4));
        statusItemViewList.get(3).setText("障碍检测:",obstacle,textsize);
        statusItemViewList.get(3).setStatusimg(imgsize);
        statusItemViewList.get(3).setstatussize(h);
        statusItemViewList.add((StatusItemView)findViewById(R.id.item5));
        statusItemViewList.get(4).setText("回填厚度:",thickness+"cm",textsize);
        statusItemViewList.get(4).setStatusimg(imgsize);
        statusItemViewList.get(4).setstatussize(h);
        ViewGroup.LayoutParams lp=thicknessbutton.getLayoutParams();
        lp.height=buttonheight;
        thicknessbutton.setLayoutParams(lp);
        lp=navi_layout.getLayoutParams();
        lp.height=buttonheight;
        navi_layout.setLayoutParams(lp);
        lp=scrollbuttonlayout.getLayoutParams();
        lp.height=buttonheight;
        scrollbuttonlayout.setLayoutParams(lp);
    }
    private void init() {
        if (aMap == null) {
            aMap = mapView.getMap();

        }



    }

    private void set_distance(String StringTemp) {
        JSONObject jsonObjectTemp = (JSONObject) JSONObject.parse(StringTemp);
        left_distance=jsonObjectTemp.get("left").toString();
        right_distance=jsonObjectTemp.get("right").toString();
        statusItemViewList.get(0).setText(left_distance+"cm");
        statusItemViewList.get(1).setText(right_distance+"cm");
    }

    public String parse_stream(InputStream is) throws Exception{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int len = -1;
        byte[] buffer = new byte[1024];
        while((len=is.read(buffer))!=-1){
            baos.write(buffer, 0, len);
        }
        is.close();
        String content = new String(baos.toByteArray());
        return content;
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

                if(i==4){
                    Log.d(TAG, "onFailure: begin trsearch");
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
                }else{
                    Log.d(TAG, "onFailure: ");
                }
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Message msg=new Message();
                msg.obj=response.body().string();
                msg.what=i;
                handler.sendMessage(msg);
                Log.e(TAG, "worksiteactivity Get方式请求成功，result--->" + msg.obj);
            }
        });
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
        /*polyline_alert =aMap.addPolyline(new PolylineOptions().
                addAll(latLngs.subList(0,9)).width(10).color(Color.argb(255, 200, 1, 1)));*/
        marker=aMap.addMarker(new MarkerOptions().position(latLngs.get(i-1)).draggable(true));
        if (isfirsttime) {
            aMap.moveCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(latLngs.get(i - 1), 19, 0, 0)));
            isfirsttime=!isfirsttime;
        }
        else{

        }

    }


    /**
     * 方法必须重写
     */

    private void resume(){
        CameraPosition cameraPosition= aMap.getCameraPosition();
        /*Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int x = point.x;
        int y = point.y;*/
        android.view.Display display = getWindowManager().getDefaultDisplay();
        //android.view.Display display2 = this.getwi
        int y=display.getHeight();
        int x=display.getWidth();
        init_status_item(x,y);
        ViewGroup.LayoutParams lp =mRealView.getLayoutParams();
        lp.width=x/360*300;
        lp.height=lp.width/16*9;
        mRealView.setLayoutParams(lp);
        lp =mapView.getLayoutParams();
        lp.width=x/360*300;
        lp.height=lp.width/16*9;
        mapView.setLayoutParams(lp);
        button_list.add((Button)findViewById(R.id.button));
        init_button(button_list.get(0),0);
        //button_list.get(0).setTextSize(x/360*60/10);
        button_list.add((Button)findViewById(R.id.button2));
        init_button(button_list.get(1),1);
        //button_list.get(1).setTextSize(x/360*60/10);
        button_list.add((Button)findViewById(R.id.button3));
        init_button(button_list.get(2),2);
        //button_list.get(2).setTextSize(x/360*60/10);
        button_list.add((Button)findViewById(R.id.button4));
        init_button(button_list.get(3),3);
        //button_list.get(3).setTextSize(x/360*60/10);
        return_button.setTextSize(x/360*30/5);
        setting_button.setTextSize(x/360*30/5);
        work_site_title.setTextSize(x/360*30/5);
        return_button.setOnClickListener(this);
        setting_button.setOnClickListener(this);
    }
    /**
     * 方法必须重写
     */


    /**
     * 方法必须重写
     */

    public class MyThread implements Runnable {
        @Override
        public void run() {

            while (true) {
                try {
                    if (Thread.currentThread().isInterrupted()) {
                        break;
                    }
                    Thread.sleep(1000);// 线程暂停1秒，单位毫秒
                    Message message = new Message();
                    message.what = 1;
                    handler_cycletask.sendMessage(message);// 发送消息
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }
    private class VideoTalkTask extends AsyncTask<String, Integer, Boolean> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mDialogProgress.setMessage(getString(R.string.waiting));
            mDialogProgress.setSpinnerType(DialogProgress.FADED_ROUND_SPINNER);
            mDialogProgress.setCancelable(false);
            mDialogProgress.show();
        }

        @Override
        protected Boolean doInBackground(String... params) {
            return videoTalk();
        }

        @Override
        protected void onPostExecute(Boolean result) {
            mDialogProgress.dismiss();
            if (!result) {
                ToolKits.showMessage(WorkSiteDetailsActivity.this, "视频对讲" + "失败");
                return;
            }
            if (!isVideoTalking) {
                button_list.get(0).setEnabled(false);
                isVideoTalking = true;
                if (!mLiveModule.isRealPlaying()) {
                    ToolKits.showMessage(WorkSiteDetailsActivity.this, "获取视频失败");
                }else if (!mTalkModule.isTalking()) {
                    ToolKits.showMessage(WorkSiteDetailsActivity.this, "对讲" + "失败");
                }
                button_list.get(1).setText("停止\n对讲");
            } else {
                isVideoTalking = false;
                button_list.get(1).setText("开始\n对讲");
                button_list.get(0).setEnabled(true);
            }

            ToolKits.showMessage(WorkSiteDetailsActivity.this, "成功");
        }
    }

    private boolean videoTalk() {
        boolean bRet = true;
        if (!isVideoTalking) {
            mTalkModule.startClientTalk();
            mLiveModule.startPlay(0,0,mRealView);
            if (!mTalkModule.isTalking() && !mLiveModule.isRealPlaying()) {
                bRet = false;
            }
        }else {
            if ( mLiveModule.getHandle() != 0) {
                mLiveModule.stopRealPlay();
            }
            mTalkModule.stopTalk();
        }

        return bRet;
    }


    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        mLiveModule.initSurfaceView(mRealView);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    @Override
    protected void onDestroy(){
        if ( mLiveModule.getHandle() != 0) {
            mLiveModule.stopRealPlay();
        }
        mTalkModule.stopTalk();
        mLiveModule = null;
        mRealView = null;
        super.onDestroy();
    }

    private Spinner initializeSpinner(final Spinner spinner, ArrayList array){
        spinner.setSelection(0,true);
        spinner.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,array));
        return spinner;
    }
}
