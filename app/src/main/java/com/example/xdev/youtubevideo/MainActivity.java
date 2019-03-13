package com.example.xdev.youtubevideo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String BASE_URL = "http://www.youtube.com/";
    String video_id = "RlF8fTQSWcs";
    String API_KEY = "AIzaSyB36qhAvxNDI07l54DP4OHoAJBEwC8cVKs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //new fragment replacement
        Fragment fragment;
        try {
            fragment = youtubeFragment.class.newInstance();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.youtubeFragment, fragment).commit();
        } catch (Exception e) {
            e.printStackTrace();
        }


        /*Retrofit.getService(BASE_URL).getURL(video_id, "default", "US", "en", "", "info").enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                String s = response.body();
                Toast.makeText(MainActivity.this, "DONE", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Fail", Toast.LENGTH_SHORT).show();

            }
        });*/
    }
}
