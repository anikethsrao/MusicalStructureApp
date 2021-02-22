package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, (List<Song>) songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View gridLayoutView = convertView;
        if (gridLayoutView == null) {
            gridLayoutView = LayoutInflater.from(getContext()).inflate(R.layout.image_grid_view, parent, false);

            gridLayoutView.

            Song currentSong = getItem(position);

            ImageView albumCover = gridLayoutView.findViewById(R.id.album_cover);
            albumCover.setImageResource(currentSong.getAlbumCoverResourceID());

            TextView songTitle = gridLayoutView.findViewById(R.id.song_title);
            songTitle.setText(currentSong.getTitle());

            TextView artistName = gridLayoutView.findViewById(R.id.song_artist);
            artistName.setText(currentSong.getArtist());

            TextView albumName = gridLayoutView.findViewById(R.id.album_name);
            albumName.setText(currentSong.getAlbum());

        } else {

            Song currentSong = getItem(position);

            ImageView albumCover = gridLayoutView.findViewById(R.id.album_cover);
            albumCover.setImageResource(currentSong.getAlbumCoverResourceID());

            TextView songTitle = gridLayoutView.findViewById(R.id.song_title);
            songTitle.setText(currentSong.getTitle());

            TextView artistName = gridLayoutView.findViewById(R.id.song_artist);
            artistName.setText(currentSong.getArtist());

            TextView albumName = gridLayoutView.findViewById(R.id.album_name);
            albumName.setText(currentSong.getAlbum());
        }

        return gridLayoutView;

    }
}
