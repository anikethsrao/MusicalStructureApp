package com.example.android.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Song> songs = new ArrayList<>();

        //Create a list of songs
        //"Song Title", "Artist Name", "Album Name", "Image Resource File"
        songs.add(new Song("Do I Wanna Know", "Arctic Monkeys", "AM", R.drawable.scorpion_drake));
        songs.add(new Song("SICKO MODE", "Travis Scott", "ASTROWORLD", R.drawable.scorpion_drake));
        songs.add(new Song("God's Plan", "Drake", "Scorpion", R.drawable.scorpion_drake));
        songs.add(new Song("Nice For What", "Drake", "Scorpion", R.drawable.scorpion_drake));
        songs.add(new Song("Nonstop", "Drake", "Scorpion", R.drawable.scorpion_drake));
        songs.add(new Song("GREECE (feat.Drake)", "DJ Khaled", "Single", R.drawable.scorpion_drake));
        songs.add(new Song("Mystery Lady", "Masego", "Studying Abroad - EP", R.drawable.scorpion_drake));
        songs.add(new Song("Tadow", "Masego", "Lady Lady", R.drawable.scorpion_drake));
        songs.add(new Song("Smells Like Teen Spirit", "Nirvana", "Nevermind", R.drawable.scorpion_drake));
        songs.add(new Song("Heart Shaped Box", "Nirvana", "In Utero", R.drawable.scorpion_drake));
        songs.add(new Song("Everlong", "Foo Fighters", "The Colour and the Shape", R.drawable.scorpion_drake));
        songs.add(new Song("The Pretender", "Foo Fighters", "Echoes, Silence, Patience & Grace", R.drawable.scorpion_drake));
        songs.add(new Song("After Hours", "The Weekend", "After Hours", R.drawable.scorpion_drake));
        songs.add(new Song("Mood (feat. iann dior)", "24kGoldn", "Single", R.drawable.scorpion_drake));

        SongAdapter songsAdapter = new SongAdapter(this, songs);

        GridView browseView = findViewById(R.id.browse_songs);

        browseView.setAdapter(songsAdapter);

    }
}