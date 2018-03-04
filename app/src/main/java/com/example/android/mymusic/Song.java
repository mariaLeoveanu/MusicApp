package com.example.android.mymusic;

import java.io.Serializable;
import java.time.Duration;

/**
 * Created by Maria on 26.02.2018.
 */

public class Song implements Serializable{
    private String name;
    private String artist;
    private String duration;

    public Song (String songName, String songArtist, String length){
        name = songName;
        artist = songArtist;
        duration = length;
    }

    public String getName (){
        return name;
    }
    public String getArtist(){
        return artist;
    }
    public String getDuration(){
        return duration;
    }


}
