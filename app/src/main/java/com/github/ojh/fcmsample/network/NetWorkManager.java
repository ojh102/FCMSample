package com.github.ojh.fcmsample.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by JaeHwan Oh on 2016-06-24.
 */
public class NetWorkManager {
    private static final String SERVER = "https://fcm.googleapis.com/fcm/";
    private Retrofit client;

    // singleton holder pattern : thread safe, lazy class initialization, memory saving.
    public static class InstanceHolder {
        public static final NetWorkManager INSTANCE = new NetWorkManager();
    }

    public static NetWorkManager getInstance() {
        return InstanceHolder.INSTANCE;
    }


    private NetWorkManager() {
        //Retrofit Enviroment setting.

        client = new Retrofit.Builder()
                .baseUrl(SERVER) // where your server lives
                .addConverterFactory(GsonConverterFactory.create()) // with what data format you want to transmit, in my case JSON
                .build();
    }

    //API Return
    public <T> T getApi(Class<T> serviceClass) {
        // connecting my API and my Retrofit environment and return.
        // then I'm able to call my API and make use of it
        return client.create(serviceClass);
    }
}