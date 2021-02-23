package com.example.android.musicalstructureapp;

import android.content.ContentProviderClient;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
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

        int currentSong = songs.getPosition();

        ImageView albumCover = findViewById(R.id.album_cover);

        albumCover.setImageResource(list.get(currentSong).getAlbumCoverResourceID());

        TextView songTitle = findViewById(R.id.song_title);
        songTitle.setText(list.get(currentSong).getTitle());

        TextView artistName = findViewById(R.id.song_artist);
        artistName.setText(list.get(currentSong).getArtist());

        TextView albumName = findViewById(R.id.album_name);
        albumName.setText(list.get(currentSong).getAlbum());

        ImageView queueImageView = findViewById(R.id.queue_button);
        queueImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NowPlayingActivity.this, Queue.class);
                startActivity(i);
            }
        });

        ImageView shuffleImageView = findViewById(R.id.shuffle);
        shuffleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (songs.getShuffle()) {
                    shuffleImageView.setImageResource(R.drawable.ic_shuffle_24px);
                    songs.sort(songs.getSortedBy());
                } else {
                    shuffleImageView.setImageResource(R.drawable.shuffle_on_24px);
                    songs.shuffleSongs();
                }
            }
        });

    }
}
