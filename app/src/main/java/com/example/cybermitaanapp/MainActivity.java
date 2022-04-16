package com.example.cybermitaanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Animation anim;
    ImageView imageView;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();
        imageView = (ImageView) findViewById(R.id.imageViewpp);
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein);
        imageView.startAnimation(anim);
        Intent msg=getIntent();
        ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.SEND_SMS,Manifest.permission.READ_SMS}, PackageManager.PERMISSION_GRANTED);

        final int longClickDuration = 3200; //for long click to trigger after 5 seconds

        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    v.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE));
                } else {
                    //deprecated in API 26
                    v.vibrate(500);
                }
                Uri number = Uri.parse("tel:9589564479");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
                return false;
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This Activity is under development", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void tap(View view) {
        ImageView img=(ImageView)view;
        String ch=img.getTag().toString();
        if(ch.equals("quesandans"))
        {
            Intent intent=new Intent(MainActivity.this,ques.class);
            startActivity(intent);
        }
        else if(ch.equals("vnp"))
        {
            Intent intent=new Intent(MainActivity.this,videos.class);
            startActivity(intent);
        }
    }




}