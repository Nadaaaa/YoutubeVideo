package com.example.xdev.youtubevideo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface NetworkUtils {


    @GET("get_video_info")
    Call<String> getURL(
            @Query("video_id") String video_id,
            @Query("ps") String ps,
            @Query("gl") String gl,
            @Query("hl") String hl,
            @Query("eurl") String eurl,
            @Query("el") String el);

}