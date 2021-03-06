package com.example.android.musicalstructureapp;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SongsObject {

    private static boolean notInitialized = true;
    private static ArrayList<Song> list = new ArrayList<>();
    private static int position;
    private static boolean shuffle = false;

    //0 -> Album
    //1 -> Artist
    //2 -> Title
    //3 -> Shuffle
    private static int sortedBy = 2;

    public SongsObject(){
        if (notInitialized){
            notInitialized = false;
            addSongs();
            sort(2);
        }
    }

    private void addSongs() {
        list.add(new Song("Senorita (feat. Shawn Mendes)", "Camila Cabello", "Romance", R.drawable.romance_camila_cabello));
        list.add(new Song("Do I Wanna Know", "Arctic Monkeys", "AM", R.drawable.am_arctic_monkeys));
        list.add(new Song("SICKO MODE", "Travis Scott", "ASTROWORLD", R.drawable.astroworld_travis_scott));
        list.add(new Song("God's Plan", "Drake", "Scorpion", R.drawable.scorpion_drake));
        list.add(new Song("Nice For What", "Drake", "Scorpion", R.drawable.scorpion_drake));
        list.add(new Song("Nonstop", "Drake", "Scorpion", R.drawable.scorpion_drake));
        list.add(new Song("GREECE (feat.Drake)", "DJ Khaled", "Single", R.drawable.greece_dj_khalid));
        list.add(new Song("Mystery Lady", "Masego", "Studying Abroad - EP", R.drawable.studying_abroad_masego));
        list.add(new Song("Tadow", "Masego", "Lady Lady", R.drawable.lady_lady_masego));
        list.add(new Song("Smells Like Teen Spirit", "Nirvana", "Nevermind", R.drawable.nevermind_nirvana));
        list.add(new Song("Heart Shaped Box", "Nirvana", "In Utero", R.drawable.in_utero_nirvana));
        list.add(new Song("Everlong", "Foo Fighters", "The Colour and the Shape", R.drawable.the_colour_and_the_shape_foo_fighters));
        list.add(new Song("The Pretender", "Foo Fighters", "Echoes, Silence, Patience & Grace", R.drawable.espg_foo_fighters));
        list.add(new Song("After Hours", "The Weekend", "After Hours", R.drawable.after_hours_the_weekend));
        list.add(new Song("Mood (feat. iann dior)", "24kGoldn", "Single", R.drawable.mood_single_24kgoldn));
        list.add(new Song("Baby Sitter (feat. Offset)", "DaBaby", "Baby on Baby", R.drawable.baby_on_baby_da_baby));
    }

    public void sort(int type) {
        shuffle = false;
        if(type == 0) {
            sortedBy = 0;
            Collections.sort(list, new Comparator<Song>() {
                public int compare(Song s1, Song s2) {
                    return s1.getAlbum().compareTo(s2.getAlbum());
                }
            });
        } else if (type == 1){
            sortedBy = 1;
            Collections.sort(list, new Comparator<Song>() {
                public int compare(Song s1, Song s2) {
                    return s1.getArtist().compareTo(s2.getArtist());
                }
            });
        } else if (type == 2){
            sortedBy = 2;
            Collections.sort(list, new Comparator<Song>() {
                public int compare(Song s1, Song s2) {
                    return s1.getTitle().compareTo(s2.getTitle());
                }
            });
        }else if (type == 3){
            sortedBy = 3;
            Collections.shuffle(list);
            shuffle = true;
        }
    }

    public static void setPosition(int position) {
        SongsObject.position = position;
    }

    public boolean getShuffle(){
        return shuffle;
    }

    public static int getPosition() {
        return position;
    }

    public ArrayList<Song> getList() {
        return list;
    }

    public int getSortedBy() {
        return sortedBy;
    }
}
