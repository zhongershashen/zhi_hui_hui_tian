package com.company.netsdk.activity.BackFill;

import android.app.Activity;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.company.netsdk.R;
public class SettingActivity extends Activity implements View.OnClickListener {
    private TextView setting_return,setting_title;
    private RadioGroup radioGroup1,radioGroup2;
    private LinearLayout setting_title_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        setting_return=(TextView) findViewById(R.id.setting_return);
        setting_return.setOnClickListener(this);
        setting_title=(TextView)findViewById(R.id.setting_title);
        setting_title_layout=(LinearLayout)findViewById(R.id.setting_title_layout);
        android.view.Display display = getWindowManager().getDefaultDisplay();
        //android.view.Display display2 = this.getwi
        int y=display.getHeight();
        int x=display.getWidth();
        int h=(y-x/360*300/16*9*2)/7;
        ViewGroup.LayoutParams lp=setting_title_layout.getLayoutParams();
        lp.height=h;
        setting_title_layout.setLayoutParams(lp);
        setting_title.setTextSize(x/360*30/5);
        setting_return.setTextSize(x/360*30/5);
        radioGroup1=findViewById(R.id.vibrate_setting);
        radioGroup2=findViewById(R.id.ring_setting);
        radioGroup1.setSelected(true);
        radioGroup2.setSelected(true);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.setting_return:
                finish();
                break;
            default:
                break;
        }
    }
}