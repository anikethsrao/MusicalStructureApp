package com.example.android.musicalstructureapp;

import android.content.res.Resources;
import android.view.View;

//Song Object to hold important information about songs stored on the app
public class Song {
    private String title;
    private String artist;
    private String album;
    private int albumCoverResourceID;
    long duration;

    /**
     * Constructor for song items
     * @param title
     * @param artist
     * @param album
     */
    public Song(String title, String artist, String album, int albumCoverResourceID){
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.albumCoverResourceID = albumCoverResourceID;
    }

    public int getAlbumCoverResourceID() {
        return albumCoverResourceID;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public long getDuration() {
        return duration;
    }
}
