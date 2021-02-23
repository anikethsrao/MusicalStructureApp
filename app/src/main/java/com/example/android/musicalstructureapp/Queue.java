package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Queue extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_queue);
        refreshList();
    }

    private void refreshList() {
        //populate list with all songs in the queue
        SongsObject songs = new SongsObject();
        SongAdapter songsAdapter = new SongAdapter(this, songs.list);
        ListView queueListView = findViewById(R.id.queue_list_view);
        queueListView.setAdapter(null);
        queueListView.setAdapter(songsAdapter);
    }
}
