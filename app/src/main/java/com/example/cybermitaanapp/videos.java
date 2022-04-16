package com.example.cybermitaanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class videos extends AppCompatActivity {
    RecyclerView recyclerView;

    String s2[];
    int images[]={R.drawable.videoone,R.drawable.videotwo,R.drawable.videothree,R.drawable.videofour,R.drawable.videofive,R.drawable.spji,R.drawable.sunil,R.drawable.rakshit,R.drawable.kabraji};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        Intent intentques=getIntent();
        recyclerView=findViewById(R.id.recyclerView);
        s2=getResources().getStringArray(R.array.des);
        mydata[] myMovieData = new mydata[]{
                new mydata("Avengers","2019 film",R.drawable.videofour),
                new mydata("Venom","2018 film",R.drawable.venom),
                new mydata("Batman Begins","2005 film",R.drawable.batman),
                new mydata("Jumanji","2019 film",R.drawable.jumanji),
                new mydata("Good Deeds","2012 film",R.drawable.good_deeds),
                new mydata("Hulk","2003 film",R.drawable.hulk),
                new mydata("Avatar","2009 film", R.drawable.avatar),
        };
        MyAdapter1 myAdapter=new MyAdapter1(myMovieData,this,s2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}