package com.example.android.project3_tourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView museum= (ImageView) findViewById(R.id.museum_img);
        museum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent museum_intent=new Intent(MainActivity.this, MuseumActivity.class);
                startActivity(museum_intent);
            }
        });
        /*

        TextView monument= (TextView) findViewById(R.id.monument_txt);
        monument.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent monument_intent=new Intent(MainActivity.this, MonumentActivity.class);
                startActivity(monument_intent);
            }
        });

        TextView park=(TextView) findViewById(R.id.parks_txt);
        park.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent park_intent=new Intent(MainActivity.this, ParkActivity.class);
                startActivity(park_intent);
            }
        });

        TextView restaurant=(TextView) findViewById(R.id.rest_txt);
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rest_intent=new Intent(MainActivity.this, RestActivity.class);
                startActivity(rest_intent);
            }
        });*/
    }
}
