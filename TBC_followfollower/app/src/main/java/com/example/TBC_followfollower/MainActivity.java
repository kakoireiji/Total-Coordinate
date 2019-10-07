package com.example.TBC_followfollower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView Backbtn=(ImageView) findViewById(R.id.backbtn);
        Backbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i=new Intent(MainActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        ImageView TimeLineicon=(ImageView) findViewById(R.id.timelineicon);
        TimeLineicon.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i=new Intent(MainActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        ImageView Searchicon=(ImageView) findViewById(R.id.searchicon);
        Searchicon.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i=new Intent(MainActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        ImageView Favoriteicon=(ImageView) findViewById(R.id.favoriteicon);
        Favoriteicon.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i=new Intent(MainActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        ImageView Coodinateicon=(ImageView) findViewById(R.id.coordinateicon);
        Coodinateicon.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i=new Intent(MainActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        ImageView Mypageicon=(ImageView) findViewById(R.id.mypageicon);
        Mypageicon.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i=new Intent(MainActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        Picasso.with(context).load(url)
                .transform(new CircleTransform()).into(imageView);
    }
}

