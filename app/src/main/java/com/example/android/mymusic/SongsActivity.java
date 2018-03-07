package com.example.android.mymusic;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        ListView listSongs;

        //getting the shared preferences file
        SharedPreferences preferences = getSharedPreferences("current index", MODE_PRIVATE);
        //getting the index
        final int index = preferences.getInt("index of album", 10);
        ReturnSongs getSongList = new ReturnSongs();


        //creating an array list depending on the index of the album
        final ArrayList<Song> songs = getSongList.getAlbumList(index);
        listSongs = findViewById(R.id.list_songs);
        SongAdapter songsAdapter = new SongAdapter(this, songs);
        listSongs.setAdapter(songsAdapter);

        listSongs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SongsActivity.this, MusicPlayer.class);
                //sending the index of the clicked song and the complete array of song
                intent.putExtra("Index", i);
                intent.putExtra("Array of songs", songs);
                startActivity(intent);

            }
        });

    }


}
