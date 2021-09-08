package com.company.netsdk.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.company.netsdk.R;

/**
 * TODO: document your custom view class.
 */
public class StatusItemView extends LinearLayout {
    private ImageView statusimg;
    // 标题Tv
    private TextView statusdata;
    private TextView statusname;
    private  LinearLayout status;
    public StatusItemView(Context context) {
        super(context);
    }

    public StatusItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // 加载布局
        LayoutInflater.from(context).inflate(R.layout.status_item, this);
        // 获取控件
        statusimg = (ImageView) findViewById(R.id.status_img);
        statusname = (TextView) findViewById(R.id.status_name);
        statusdata = (TextView) findViewById(R.id.status_data);
        /*lefttext=(LinearLayout)findViewById(R.id.lefttext);
        mideltext=(LinearLayout)findViewById(R.id.mideltext);*/
        status=(LinearLayout) findViewById(R.id.status);
    }
    // 设置标题的方法
    public void setText(String name,String data,int size) {
        statusname.setText(name);
        statusdata.setText(data);
        statusname.setTextSize(TypedValue.COMPLEX_UNIT_PX,size);
        statusdata.setTextSize(TypedValue.COMPLEX_UNIT_PX,size);

    }
    public void setText(String data) {
        statusdata.setText(data);

    }
    public void setStatus(boolean status){
        if(status){
            statusdata.setTextColor(Color.rgb(0,0,255));
            statusimg.setImageResource(R.drawable.r);

        }else{
            statusdata.setTextColor(Color.rgb(255,0,0));
            statusimg.setImageResource(R.drawable.w);
        }
    }
    public  void setspace(int size){
        /*ViewGroup.LayoutParams lp= topspace.getLayoutParams();
        lp.height=size;
        topspace.setLayoutParams(lp);
        lp= bottomspace.getLayoutParams();
        lp.height=size;
        bottomspace.setLayoutParams(lp);*/
    }
    public void setStatusimg(int size){
        ViewGroup.LayoutParams lp = statusimg.getLayoutParams();
        lp.height=size;
        lp.width=size;
        statusimg.setLayoutParams(lp);
    }
    public void setstatussize(int size){
        ViewGroup.LayoutParams lp = status.getLayoutParams();
        lp.height=size;
        status.setLayoutParams(lp);
        /*lp = righttext.getLayoutParams();
        lp.height=size;
        righttext.setLayoutParams(lp);
        lp = mideltext.getLayoutParams();
        lp.height=size;
        mideltext.setLayoutParams(lp);*/
    }
}