package com.example.android.mymusic;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);


        //creating an array with the albums
        final ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album(R.drawable.damn, "DAMN", "Kendrick Lamar", 14));
        albums.add(new Album(R.drawable.morelife, "More Life", "Drake", 22));
        albums.add(new Album(R.drawable.thegetaway, "The Getaway", "Red Hot Chili Peppers", 13));
        albums.add(new Album(R.drawable.zaba, "Zaba", "Glass Animals", 11));

        AlbumAdapter albumAdapter = new AlbumAdapter(this, albums);

        //grid view where albums will be displayed
        GridView gridView = findViewById(R.id.album_grid);

        gridView.setAdapter(albumAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, SongsActivity.class);
                //adding the index of the clicked album in sharedPrefs
                SharedPreferences sharedPreferences = getSharedPreferences("current index", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("index of album", i);
                editor.commit();
                startActivity(intent);

            }
        });

    }
}
