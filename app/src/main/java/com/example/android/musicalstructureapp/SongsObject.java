package com.example.android.musicalstructureapp;

import java.util.ArrayList;
import java.util.Collections;

public class SongsObject {

    static ArrayList<Song> list = new ArrayList<>();
    static int position;

    public SongsObject() {
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

    public static void setPosition(int position) {
        SongsObject.position = position;
    }

    public static int getPosition() {
        return position;
    }

    public ArrayList<Song> getList() {
        return list;
    }

    private void sortByName(){
        //TODO: add function to sort songs in alphabetical order by name
    }

    public void shuffleSongs(){
        Collections.shuffle(list);
    }

    public void unShuffleSongs(){
        //TODO: call sort by name function to unsort the queue
    }

}
