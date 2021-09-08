package com.company.netsdk.service;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import com.company.netsdk.service.Resp;
import com.google.gson.Gson;

public class InternetService {
    private Resp resp;
    Gson gson = new Gson();
    private final String baseUrl = "http://60.205.215.111:31017/";
    OkHttpClient client = new OkHttpClient();
    public static final MediaType JSON
            = MediaType.get("application/json; charset=utf-8");


    private static InternetService internetService;

    private InternetService(){}

    public static InternetService getInternetService(){
        if(internetService == null){
            internetService = new InternetService();
        }
        return internetService;
    }



    //    get请求，传入url，返回response的字符串。
    public Resp get(String url) throws IOException {
        Request request = new Request.Builder()
                .url(baseUrl+url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            resp = gson.fromJson(response.body().string(), Resp.class);
            return resp;
        }
    }

    //    post请求，传入url和请求参数（json），返回response的字符串。
    public Resp post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(baseUrl+url)
                .post(body)
                .build();
        System.out.println(baseUrl+url);
        try (Response response = client.newCall(request).execute()) {
            resp = gson.fromJson(response.body().string(), Resp.class);
            return resp;
        }
    }

}
