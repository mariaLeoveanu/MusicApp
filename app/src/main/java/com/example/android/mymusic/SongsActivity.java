package com.example.android.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    Button albumsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        //getting the intent
        Intent albumIntent = getIntent();

        //retrieving the data about the current album
        final Album currentAlbum = (Album) albumIntent.getSerializableExtra("CurrentAlbum");

        //creating an array with the songs in that album
        final ArrayList<Song> songs = currentAlbum.getSongs();

        final ListView listSongs = findViewById(R.id.list_songs);
        SongAdapter songsAdapter = new SongAdapter(this, songs);

        listSongs.setAdapter(songsAdapter);
        listSongs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SongsActivity.this, MusicPlayer.class);
                //sending the index of the song
                intent.putExtra("Index", i);
                //putting extra information about the song and the album
                intent.putExtra("CurrentAlbum", currentAlbum);
                startActivity(intent);

            }
        });
        albumsButton = (Button) findViewById(R.id.back_to_albums);
        albumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SongsActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }


}
