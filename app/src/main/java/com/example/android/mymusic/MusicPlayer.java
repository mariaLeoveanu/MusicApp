package com.example.android.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MusicPlayer extends AppCompatActivity {
    ImageView playPauseIcon;
    ImageView nextIcon;
    ImageView previousIcon;
    Song currentSong;
    Album album;
    TextView endTime;
    ImageView albumArt;
    TextView songArtist;
    TextView songName;
    Button backSongs;
    boolean isPlaying = true;
    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);
        playPauseIcon = (ImageView) findViewById(R.id.pause_play_button);
        nextIcon = (ImageView) findViewById(R.id.next_button);
        previousIcon = (ImageView)findViewById(R.id.previous_button);
        endTime = (TextView) findViewById(R.id.end_time);
        backSongs = (Button)findViewById(R.id.back_to_songs);
        Intent playerIntent = getIntent();
        i = playerIntent.getIntExtra("Index",-1000);
        album = (Album) playerIntent.getSerializableExtra("CurrentAlbum");
        currentSong = album.getSongs().get(i);
        setAlbumContents();
        setPlayPauseIcon();
        playNextSong();
        playPreviousSong();
        backToSongs();

    }

    private void setAlbumContents() {

        final View player_layout = findViewById(R.id.media_player);
        songArtist = player_layout.findViewById(R.id.artist);
        songName = player_layout.findViewById(R.id.song);
        albumArt = player_layout.findViewById(R.id.album_image);
        albumArt.setImageResource(album.getAlbumArt());
        albumArt.setAdjustViewBounds(true);
        songArtist.setText(currentSong.getArtist());
        songName.setText(currentSong.getName());
        endTime.setText(currentSong.getDuration());
    }

    private void setPlayPauseIcon() {
        playPauseIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPlaying) {
                    playPauseIcon.setImageResource(R.drawable.play);
                    isPlaying = false;
                    Toast toast = Toast.makeText(MusicPlayer.this, "paused", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    playPauseIcon.setImageResource(R.drawable.pause_button);
                    isPlaying = true;
                    Toast toast = Toast.makeText(MusicPlayer.this, "playing", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });
    }

    private void playNextSong() {
        nextIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Song> songsInAlbum = album.getSongs();
                String s = currentSong.getName();
                Log.v("Index, name: ", ""+i+s);
                if (i==songsInAlbum.size()-1) {
                    i=0;
                    currentSong = songsInAlbum.get(0);
                }else {
                    i++;
                    currentSong = songsInAlbum.get(i);}
                setAlbumContents();
            }
        });

    }
    private void playPreviousSong() {
        previousIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Song> songsInAlbum = album.getSongs();
                if (i==0) {
                    i = songsInAlbum.size()-1;
                    currentSong = songsInAlbum.get(i);
                }else {
                    i--;
                    currentSong = songsInAlbum.get(i);}
                setAlbumContents();
            }
        });
    }

private void backToSongs (){
        backSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MusicPlayer.this,SongsActivity.class);
                i.putExtra("CurrentAlbum", album);
                startActivity(i);
            }
        });
}
}
