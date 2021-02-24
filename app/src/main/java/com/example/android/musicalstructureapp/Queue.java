package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Queue extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_queue);

        SongsObject songs = new SongsObject();
        SongAdapter songsAdapter = new SongAdapter(this, songs.getList());
        ListView queueListView = findViewById(R.id.queue_list_view);
        queueListView.setAdapter(null);
        queueListView.setAdapter(songsAdapter);
    }
}
