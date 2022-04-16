package com.example.cybermitaanapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class MyAdapter1 extends RecyclerView.Adapter<MyAdapter1.MyViewHolder> {
    String[] data2;
    int[] images;
    mydata[] mydata;
    Context context;

    public MyAdapter1(com.example.cybermitaanapp.mydata[] myMovieData, Context ct, String[] s2, int[] img){
        context=ct;
        data2 =s2;
        this.mydata = myMovieData;
        this.images =img;



    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.my_row1,parent,false);
        return  new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        final mydata myMovieDataList = mydata[position];
        holder.myText2.setText(data2[position]);
        holder.myImage.setImageResource(images[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {/////
            @Override
            public void onClick(View v) {

                if(myMovieDataList.getMovieName()=="Avengers"){
                    Toast.makeText(context, myMovieDataList.getMovieName(), Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView myImage;
        TextView  myText2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText2=itemView.findViewById(R.id.textView3);
            myImage=itemView.findViewById(R.id.myImageView);




        }
    }
}
