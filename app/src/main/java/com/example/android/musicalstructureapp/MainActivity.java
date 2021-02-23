package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browse);

        SongsObject songs = new SongsObject();

        SongAdapter songsAdapter = new SongAdapter(this, songs.list);

        GridView browseView = findViewById(R.id.browse_song_grid);

        browseView.setAdapter(songsAdapter);

        //TODO: fix order of items inflated to alphabetical order by name
        //TODO: change sort to by album or artist name

        browseView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                songs.setPosition(position);
                Intent i = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(i);
            }

        });
    }
}