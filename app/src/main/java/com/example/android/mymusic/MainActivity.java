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
        songsDNA.add(new Song("BLOOD", "Kendrick Lamar", "1:58"));
        songsDNA.add(new Song("DNA", "Kendrick Lamar", "3:05"));
        songsDNA.add(new Song("YAH", "Kendrick Lamar", "2:40"));
        songsDNA.add(new Song("ELEMENT", "Kendrick Lamar", "3:29"));
        songsDNA.add(new Song("FEEL", "Kendrick Lamar", "3:35"));
        songsDNA.add(new Song("LOYALTY","Kendrick Lamar", "3:48"));
        songsDNA.add(new Song("PRIDE", "Kendrick Lamar", "4:35"));
        songsDNA.add(new Song("HUMBLE", "Kendrick Lamar", "2:57"));
        songsDNA.add(new Song("LUST", "Kendrick Lamar", "5:08"));
        songsDNA.add(new Song("LOVE", "Kendrick Lamar","3:33"));
        songsDNA.add(new Song("XXX", "Kendrick Lamar", "4:14"));
        songsDNA.add(new Song("FEAR", "Kendrick Lamar", "7:41"));
        songsDNA.add(new Song("GOD", "Kendrick Lamar", "4:09"));

        //songs in More Life album
        ArrayList<Song> songsMoreLife = new ArrayList<>();
        songsMoreLife.add(new Song("Free Smoke", "Drake","2:34"));
        songsMoreLife.add(new Song("No long talk", "Drake","2:30"));
        songsMoreLife.add(new Song("Passionfruit","Drake", "4:59"));
        songsMoreLife.add(new Song("Jorja interlude", "Drake", "1:48"));
        songsMoreLife.add(new Song("Get it together", "Drake", "4:10"));
        songsMoreLife.add(new Song("Madiba Riddim", "Drake","3:25"));
        songsMoreLife.add(new Song("Blem", "Drake","3:37"));
        songsMoreLife.add(new Song("4422", "Drake", "3:06"));
        songsMoreLife.add(new Song("Gyalchester", "Drake","3:09"));
        songsMoreLife.add(new Song("Skepta interlude", "Drake", "2:23"));
        songsMoreLife.add(new Song("Portland", "Drake","3:57"));
        songsMoreLife.add(new Song("Sacrifices", "Drake","5:08"));
        songsMoreLife.add(new Song("Nothings into somethings", "Drake", "2:34"));
        songsMoreLife.add(new Song("Teenage fever", "Drake", "3:40"));
        songsMoreLife.add(new Song("KMT", "Drake", "2:43"));
        songsMoreLife.add(new Song("Lose you", "Drake","5:05"));
        songsMoreLife.add(new Song("Can't have everything", "Drake","3:49"));
        songsMoreLife.add(new Song("Glow", "Drake","3:26"));
        songsMoreLife.add(new Song("Since way back", "Drake","6:08"));
        songsMoreLife.add(new Song("Free Smoke", "Drake", "2:34"));
        songsMoreLife.add(new Song("Fake love", "Drake", "3:31"));
        songsMoreLife.add(new Song("Ice melts", "Drake", "4:11"));
        songsMoreLife.add(new Song("Do not disturb", "Drake", "4:44"));

        //songs in The Getaway album
        ArrayList<Song> songsTheGetAway = new ArrayList<>();
        songsTheGetAway.add(new Song("The getaway", "Red Hot Chili Peppers", "4:10"));
        songsTheGetAway.add(new Song("Dark necessities", "Red Hot Chili Peppers","5:02"));
        songsTheGetAway.add(new Song("We turn red", "Red Hot Chili Peppers","3:20"));
        songsTheGetAway.add(new Song("The longest wave", "Red Hot Chili Peppers","3:31"));
        songsTheGetAway.add(new Song("Goodbye angels", "Red Hot Chili Peppers","4:29"));
        songsTheGetAway.add(new Song("Sick love", "Red Hot Chili Peppers","3:41"));
        songsTheGetAway.add(new Song("Go robot", "Red Hot Chili Peppers","4:24"));
        songsTheGetAway.add(new Song("Feasting on the flowers", "Red Hot Chili Peppers","3:23"));
        songsTheGetAway.add(new Song("Detroit", "Red Hot Chili Peppers","3:47"));
        songsTheGetAway.add(new Song("This ticonderoga", "Red Hot Chili Peppers","3:35"));
        songsTheGetAway.add(new Song("Encore", "Red Hot Chili Peppers","4:15"));
        songsTheGetAway.add(new Song("The hunter ", "Red Hot Chili Peppers","4:00"));
        songsTheGetAway.add(new Song("Dreams of a samurai", "Red Hot Chili Peppers","6:09"));

        //songs in Zaba album
        ArrayList<Song> songsZaba = new ArrayList<>();
        songsZaba.add(new Song("Flip", "Glass Animals", "3:43"));
        songsZaba.add(new Song("Black mambo", "Glass Animals", "4:09"));
        songsZaba.add(new Song("Pools", "Glass Animals", "4:49"));
        songsZaba.add(new Song("Gooey", "Glass Animals", "4:49"));
        songsZaba.add(new Song("Walla walla", "Glass Animals", "3:37"));
        songsZaba.add(new Song("Intruxx", "Glass Animals","2:49"));
        songsZaba.add(new Song("Hazey", "Glass Animals", "4:26"));
        songsZaba.add(new Song("Toes", "Glass Animals","4:15"));
        songsZaba.add(new Song("Wyrd", "Glass Animals","4:06"));
        songsZaba.add(new Song("Cocoa hooves", "Glass Animals","4:32"));
        songsZaba.add(new Song("JDNT", "Glass Animals", "4:24"));

        //creating an array with the albums that have each, one array of songs
        final ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album(R.drawable.damn, "DAMN", "Kendrick Lamar", 14, songsDNA));
        albums.add(new Album(R.drawable.morelife, "More Life", "Drake", 22, songsMoreLife));
        albums.add(new Album(R.drawable.thegetaway, "The Getaway", "Red Hot Chili Peppers",13, songsTheGetAway));
        albums.add(new Album(R.drawable.zaba, "Zaba","Glass Animals", 11, songsZaba));

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
