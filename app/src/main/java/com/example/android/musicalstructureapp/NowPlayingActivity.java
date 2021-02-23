package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        SongsObject songs = new SongsObject();
        ArrayList<Song> list = songs.getList();

        ImageView albumCover = findViewById(R.id.album_cover);

        albumCover.setImageResource(list.get(0).getAlbumCoverResourceID());

        TextView songTitle = findViewById(R.id.song_title);
        songTitle.setText(list.get(0).getTitle());

        TextView artistName = findViewById(R.id.song_artist);
        artistName.setText(list.get(0).getArtist());

        TextView albumName = findViewById(R.id.album_name);
        albumName.setText(list.get(0).getAlbum());

    }
}
