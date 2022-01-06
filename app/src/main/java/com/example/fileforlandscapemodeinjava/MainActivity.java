package com.example.fileforlandscapemodeinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    void initView(){
        VideoView videoView1 = findViewById(R.id.video1);
        VideoView videoView2 = findViewById(R.id.video2);
        String videoPath = "android.resource://com.example.fileforlandscapemodeinjava/raw/man";
        String videoPath2 = "android.resource://com.example.fileforlandscapemodeinjava/raw/rrs";
        Uri uri = Uri.parse(videoPath);
        videoView1.setVideoURI(uri);
        videoView1.requestFocus();
        videoView1.start();
        Uri uri2 = Uri.parse(videoPath2);
        videoView2.setVideoURI(uri2);
        videoView2.requestFocus();
        videoView2.start();

    }
}