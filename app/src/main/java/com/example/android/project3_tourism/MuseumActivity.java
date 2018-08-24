package com.example.android.project3_tourism;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sights_list);

        final ArrayList<Names> sights = new ArrayList<Names>();
        sights.add(new Names(getString(R.string.science_museum), R.drawable.science_museum));
        sights.add(new Names(getString(R.string.rail_museum), R.drawable.rail_museum));
        sights.add(new Names(getString(R.string.air_force_museum), R.drawable.air_force_museum));
        sights.add(new Names(getString(R.string.craft_museum), R.drawable.crafts_museum));

        NamesAdapter adapter = new NamesAdapter(this, sights);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}

