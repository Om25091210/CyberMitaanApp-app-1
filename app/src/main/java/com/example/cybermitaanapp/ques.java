package com.example.cybermitaanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ques extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[],s2[];
    int images[]={R.drawable.bhidu,R.drawable.bhidu,R.drawable.bhidu,R.drawable.bhidu,R.drawable.bhidu,R.drawable.bhidu,R.drawable.bhidu,R.drawable.bhidu,R.drawable.bhidu,R.drawable.bhidu};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques);
        Intent intentques=getIntent();
        recyclerView=findViewById(R.id.recyclerView);
        s1=getResources().getStringArray(R.array.programming_languages);
        s2=getResources().getStringArray(R.array.description);

        MyAdapter myAdapter=new MyAdapter(this,s1,s2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}