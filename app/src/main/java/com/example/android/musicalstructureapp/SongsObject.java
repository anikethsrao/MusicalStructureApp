package com.example.android.musicalstructureapp;

import java.util.ArrayList;
import java.util.Collections;

public class SongsObject {

    final ArrayList<Song> songs = new ArrayList<>();

    public SongsObject() {
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
    }

    private void sortByName(){
        //TODO: add function to sort songs in alphabetical order by name
    }

    public void shuffleSongs(){
        Collections.shuffle(songs);
    }

    public void unShuffleSongs(){
        //TODO: call sort by name function to unsort the queue
    }

}
