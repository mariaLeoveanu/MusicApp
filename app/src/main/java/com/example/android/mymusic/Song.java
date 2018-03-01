package com.example.android.mymusic;

import java.io.Serializable;
import java.time.Duration;

/**
 * Created by Maria on 26.02.2018.
 */

public class Song implements Serializable{
    private String name;
    private String artist;
    private int imageResource;
    private String duration;

    public Song (String songName, String songArtist, int songAlbumImage, String length){
        name = songName;
        artist = songArtist;
        imageResource = songAlbumImage;
        duration = length;
    }

    public String getName (){
        return name;
    }
    public String getArtist(){
        return artist;
    }
    public int getImageResource(){
        return imageResource;
    }
    public String getDuration(){
        return duration;
    }


}
