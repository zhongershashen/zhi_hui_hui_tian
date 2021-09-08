package com.company.netsdk.service;

public class Resp {
    private String data;
    private String message;
    private String status;

    public Resp(String data, String message, String status) {
        this.data = data;
        this.message = message;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Responce{" +
                "data='" + data + '\'' +
                ", message='" + message + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }
}
