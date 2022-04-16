package com.example.cybermitaanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.VideoView;

public class splash extends AppCompatActivity {
    VideoView videoView;
    ImageView imageView;
    Animation anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Intent intent=getIntent();
        videoView=findViewById(R.id.vv);
        String videopath="android.resource://com.example.cybermitaanapp/"+ R.raw.vidw;
        Uri uri=Uri.parse(videopath);
        videoView.setVideoURI(uri);
        videoView.start();
        imageView=(ImageView)findViewById(R.id.imageView28);
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim);
        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(splash.this,MainActivity.class));
                finish();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        imageView.startAnimation(anim);
    }
}