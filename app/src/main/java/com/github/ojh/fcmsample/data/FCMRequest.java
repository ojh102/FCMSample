package com.github.ojh.fcmsample.data;

/**
 * Created by JaeHwan Oh on 2016-07-12.
 */
public class FCMRequest {

    public FCMRequest(FCMData data, String to) {
        this.data = data;
        this.to = to;
    }

    private FCMData data;
    private String to;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public FCMData getData() {
        return data;
    }

    public void setData(FCMData data) {
        this.data = data;
    }
}
