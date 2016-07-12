package com.github.ojh.fcmsample.network;

import com.github.ojh.fcmsample.data.FCMRequest;
import com.github.ojh.fcmsample.data.FCMResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by JaeHwan Oh on 2016-07-12.
 */
public interface FCMApi {
    @Headers({"Content-Type: application/json"})
    @POST("send")
    Call<FCMResponse> push(@Header("Authorization") String apiKey,
                           @Body FCMRequest message);
}
