package com.example.cybermitaanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class SmsOpen extends AppCompatActivity {
    EditText Input;
    ImageView send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_open);
        Intent Smsintent=getIntent();
        Input=findViewById(R.id.InputMsg);
        send=findViewById(R.id.imageView24);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message=Input.getText().toString();
                SmsManager mysmsManager=SmsManager.getDefault();

                mysmsManager.sendTextMessage("7999502978",null,message,null,null);
                Toast.makeText(SmsOpen.this,"Message Sent Successfully!!!",Toast.LENGTH_SHORT).show();
                Intent intent1=new Intent(SmsOpen.this,MainActivity.class);
                startActivity(intent1);
            }
        });

    }
}