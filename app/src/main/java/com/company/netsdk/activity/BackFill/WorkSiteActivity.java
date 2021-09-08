package com.company.netsdk.activity.BackFill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.company.netsdk.R;
import com.company.netsdk.service.InternetService;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class WorkSiteActivity extends AppCompatActivity {


    InternetService internetService;

    private String[] worksiteList;

    private ListView listView;

    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_site);
        internetService = InternetService.getInternetService();
        listView = (ListView) findViewById(R.id.list);
        Intent intent = getIntent();
        String name = intent.getStringExtra("username");
        try {
            worksiteList = getList(name);
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        adapter = new ArrayAdapter<String>(
                WorkSiteActivity.this, android.R.layout.simple_list_item_1, worksiteList
        );
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(WorkSiteActivity.this, WorkSiteDetailsActivity.class);
                intent.putExtra("site",adapter.getItem(position).toString());
                System.out.println(adapter.getItem(position).toString());
                startActivity(intent);
            }
        });
    }

    private String[] getList(String username) throws JSONException, IOException {

        JSONObject json = new JSONObject();
        json.put("username",username);
//        String response = internetService.post(" ",json.toString());


        return new String[]{"智慧工地"};
    }

}