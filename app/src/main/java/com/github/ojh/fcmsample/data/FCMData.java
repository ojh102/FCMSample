package com.github.ojh.fcmsample.data;

/**
 * Created by JaeHwan Oh on 2016-07-12.
 */
public class FCMData {

    private String title;
    private String message;

    public FCMData(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
