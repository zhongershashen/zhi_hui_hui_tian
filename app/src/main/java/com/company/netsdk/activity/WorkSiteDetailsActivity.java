package com.company.netsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.MapView;
import com.company.netsdk.R;
import java.util.List;
import java.util.ArrayList;
public class WorkSiteDetailsActivity extends Activity implements View.OnClickListener {

    private MapView mapView;
    private AMap aMap;
    private List<Button> button_list=new ArrayList<Button>();

    private RadioGroup mRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_site_details);
        mapView = (MapView) findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);// 此方法必须重写

        init();
    }

    /**
     * 初始化AMap对象
     */
    private void init() {
        if (aMap == null) {
            aMap = mapView.getMap();

        }
        button_list.add((Button)findViewById(R.id.button));
        button_list.get(0).setOnClickListener(this);
        button_list.add((Button)findViewById(R.id.button2));
        button_list.get(1).setOnClickListener(this);
        button_list.add((Button)findViewById(R.id.button3));
        button_list.get(2).setOnClickListener(this);
        button_list.add((Button)findViewById(R.id.button4));
        button_list.get(3).setOnClickListener(this);
    }

    /**
     * 方法必须重写
     */
    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    /**
     * 方法必须重写
     */
    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    /**
     * 方法必须重写
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

    /**
     * 方法必须重写
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                aMap.setMapType(AMap.MAP_TYPE_NORMAL);// 矢量地图模式
                break;
            case R.id.button2:
                aMap.setMapType(AMap.MAP_TYPE_SATELLITE);// 卫星地图模式
                break;
            case R.id.button3:
                aMap.setMapType(AMap.MAP_TYPE_NORMAL);// 矢量地图模式
                break;
            case R.id.button4:
                aMap.setMapType(AMap.MAP_TYPE_SATELLITE);// 卫星地图模式
                break;
        }

    }

}