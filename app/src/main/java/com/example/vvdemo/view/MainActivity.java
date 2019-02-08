package com.example.vvdemo.view;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.vvdemo.R;
import com.vimeo.networking.VimeoClient;

public class MainActivity extends AppCompatActivity {

    public static final String STAFF_PICKS_VIDEO_URI = "/channels/927/videos"; // 927 == staffpicks

    private VimeoClient mApiClient = VimeoClient.getInstance();
    private ProgressDialog mProgressDialog;

    private TextView mRequestOutputTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
