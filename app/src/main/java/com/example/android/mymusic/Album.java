package com.example.android.mymusic;

import java.io.Serializable;

/**
 * Created by Maria on 25.02.2018.
 */

public class Album implements Serializable {
    private int albumArt;
    private String albumName;
    private String artist;
    private int numberOfSongs;

    public Album(int imageID, String nameAlbum, String albumArtist, int numOfSongs) {
        albumArt = imageID;
        albumName = nameAlbum;
        artist = albumArtist;
        numberOfSongs = numOfSongs;
    }

    public int getAlbumArt() {
        return albumArt;
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtist() {
        return artist;
    }

}
