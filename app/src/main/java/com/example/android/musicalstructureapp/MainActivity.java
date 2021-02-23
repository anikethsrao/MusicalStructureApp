package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    static SongsObject songs = new SongsObject();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setup spinner to select list sort type
        Spinner spinner = (Spinner) findViewById(R.id.sort_menu);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.sort_menu, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        //Check sort type before setting spinner value
        int sortedBy = songs.getSortedBy();
        spinner.setSelection(sortedBy);

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

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        if(position != songs.getSortedBy()) {
            songs.sort(position);
            Intent i = new Intent(MainActivity.this, MainActivity.class);
            startActivity(i);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //Leaving Empty
    }

    private void refreshList() {
        //populate list with all songs in the queue
        SongAdapter songsAdapter = new SongAdapter(this, songs.getList());
        GridView browseView = findViewById(R.id.browse_song_grid);
        browseView.setAdapter(songsAdapter);
    }
}