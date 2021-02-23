package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    SongsObject songs = new SongsObject();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browse);

        //Setup spinner to select list sort type
        Spinner spinner = (Spinner) findViewById(R.id.sort_menu);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.sort_menu, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Check sort type before setting spinner value
        String sortedBy = songs.getSortedBy();
        if (sortedBy.equals("Album")) {
            //TODO: setSelection(INDEX);
        } else if (sortedBy.equals("Artist")) {
            //TODO: setSelection(INDEX);
        } else if (sortedBy.equals("Title")) {
            //TODO: setSelection(INDEX);
        }

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        //TODO: fix order of items inflated to alphabetical order by name
        //TODO: change sort to by album or artist name

        refreshList();

        GridView browseView = findViewById(R.id.browse_song_grid);
        browseView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                songs.setPosition(position);
                Intent i = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(i);
            }

        });
    }

    private void refreshList() {
        //populate list with all songs in the queue
        SongAdapter songsAdapter = new SongAdapter(this, songs.list);
        GridView browseView = findViewById(R.id.browse_song_grid);
        browseView.setAdapter(songsAdapter);
    }
}