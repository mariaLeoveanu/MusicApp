package com.example.android.mymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
        //songs in DNA album
        ArrayList<Song> songsDNA = new ArrayList<>();
        songsDNA.add(new Song("BLOOD", "Kendrick Lamar", R.drawable.damn, "1:58"));
        songsDNA.add(new Song("DNA", "Kendrick Lamar", R.drawable.damn, "3:05"));
        songsDNA.add(new Song("YAH", "Kendrick Lamar", R.drawable.damn, "2:40"));
        songsDNA.add(new Song("ELEMENT", "Kendrick Lamar", R.drawable.damn, "3:29"));
        songsDNA.add(new Song("FEEL", "Kendrick Lamar", R.drawable.damn, "3:35"));
        songsDNA.add(new Song("LOYALTY","Kendrick Lamar", R.drawable.damn, "3:48"));
        songsDNA.add(new Song("PRIDE", "Kendrick Lamar", R.drawable.damn, "4:35"));
        songsDNA.add(new Song("HUMBLE", "Kendrick Lamar", R.drawable.damn, "2:57"));
        songsDNA.add(new Song("LUST", "Kendrick Lamar", R.drawable.damn, "5:08"));
        songsDNA.add(new Song("LOVE", "Kendrick Lamar", R.drawable.damn, "3:33"));
        songsDNA.add(new Song("XXX", "Kendrick Lamar", R.drawable.damn, "4:14"));
        songsDNA.add(new Song("FEAR", "Kendrick Lamar", R.drawable.damn, "7:41"));
        songsDNA.add(new Song("GOD", "Kendrick Lamar", R.drawable.damn, "4:09"));

        //songs in More Life album
        ArrayList<Song> songsMoreLife = new ArrayList<>();
        songsMoreLife.add(new Song("Free Smoke", "Drake", R.drawable.morelife,"2:34"));
        songsMoreLife.add(new Song("No long talk", "Drake", R.drawable.morelife,"2:30"));
        songsMoreLife.add(new Song("Passionfruit","Drake",R.drawable.morelife, "4:59"));
        songsMoreLife.add(new Song("Jorja interlude", "Drake", R.drawable.morelife,"1:48"));
        songsMoreLife.add(new Song("Get it together", "Drake", R.drawable.morelife,"4:10"));
        songsMoreLife.add(new Song("Madiba Riddim", "Drake", R.drawable.morelife,"3:25"));
        songsMoreLife.add(new Song("Blem", "Drake", R.drawable.morelife,"3:37"));
        songsMoreLife.add(new Song("4422", "Drake", R.drawable.morelife,"3:06"));
        songsMoreLife.add(new Song("Gyalchester", "Drake", R.drawable.morelife,"3:09"));
        songsMoreLife.add(new Song("Skepta interlude", "Drake", R.drawable.morelife,"2:23"));
        songsMoreLife.add(new Song("Portland", "Drake", R.drawable.morelife,"3:57"));
        songsMoreLife.add(new Song("Sacrifices", "Drake", R.drawable.morelife,"5:08"));
        songsMoreLife.add(new Song("Nothings into somethings", "Drake", R.drawable.morelife,"2:34"));
        songsMoreLife.add(new Song("Teenage fever", "Drake", R.drawable.morelife,"3:40"));
        songsMoreLife.add(new Song("KMT", "Drake", R.drawable.morelife,"2:43"));
        songsMoreLife.add(new Song("Lose you", "Drake", R.drawable.morelife,"5:05"));
        songsMoreLife.add(new Song("Can't have everything", "Drake", R.drawable.morelife,"3:49"));
        songsMoreLife.add(new Song("Glow", "Drake", R.drawable.morelife,"3:26"));
        songsMoreLife.add(new Song("Since way back", "Drake", R.drawable.morelife,"6:08"));
        songsMoreLife.add(new Song("Free Smoke", "Drake", R.drawable.morelife,"2:34"));
        songsMoreLife.add(new Song("Fake love", "Drake", R.drawable.morelife,"3:31"));
        songsMoreLife.add(new Song("Ice melts", "Drake", R.drawable.morelife,"4:11"));
        songsMoreLife.add(new Song("Do not disturb", "Drake", R.drawable.morelife,"4:44"));

        //creating an array with the albums that have each, one array of songs
        final ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album(R.drawable.damn, "DNA", "Kendrick Lamar", 14, songsDNA));
        albums.add(new Album(R.drawable.morelife, "More Life", "Drake", 22, songsMoreLife));

        AlbumAdapter albumAdapter = new AlbumAdapter(this,albums);

        //grid view where albums will be displayed
        GridView gridView = findViewById(R.id.album_grid);

        gridView.setAdapter(albumAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              Intent intent = new Intent(MainActivity.this, SongsActivity.class);
              //getting the current album that was clicked at position i
              Album album = albums.get(i);
              //sending the current album to the next activity
              intent.putExtra("CurrentAlbum",album);
              startActivity(intent);

          }
      });

    }
}
