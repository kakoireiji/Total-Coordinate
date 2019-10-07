package com.example.TBC_followfollower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
        Button Follow=(Button)findViewById(R.id.follow);
        Follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    JSONArray jarray = new JSONArray("[{\"ID\":\"001\",\"Name\":\"あんどろいど\"},{\"ID\":\"002\",\"Name\":\"あいふぉん\"}]");
                    for (int i = 0; i < jarray.length(); ++ i) {
                        JSONObject json = jarray.getJSONObject(i);
                        String id   = json.getString("ID");
                        String name = json.getString("Name");

                    }
                }
                catch (org.json.JSONException e) {
ss
                }
               try{jjjjkkkk
                   httpRequest("http://www");
               }catch (Exception e){
                   Log.e("Hoge",e.getMessage());
               }

            }
        });
        Button Follower=(Button)findViewById(R.id.follower);
        Follower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}

