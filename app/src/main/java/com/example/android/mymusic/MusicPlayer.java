package com.example.android.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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
    int indexCurrentSong;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        playPauseIcon = findViewById(R.id.pause_play_button);
        nextIcon = findViewById(R.id.next_button);
        previousIcon = findViewById(R.id.previous_button);
        endTime = findViewById(R.id.end_time);
        backSongs = findViewById(R.id.back_to_songs);

        Intent playerIntent = getIntent();
        indexCurrentSong = playerIntent.getIntExtra("Index",-1000); //put -1000 to have an obvious error if i don't get any index through intent
        album = (Album) playerIntent.getSerializableExtra("CurrentAlbum");
        currentSong = album.getSongs().get(indexCurrentSong);// get album at index i

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
                    Toast toast = Toast.makeText(MusicPlayer.this, R.string.toast_paused, Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    playPauseIcon.setImageResource(R.drawable.pause_button);
                    isPlaying = true;
                    Toast toast = Toast.makeText(MusicPlayer.this, R.string.toast_playing, Toast.LENGTH_SHORT);
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
                if (indexCurrentSong==songsInAlbum.size()-1) {
                    indexCurrentSong=0; //if on last position, move to the first song in playlist
                    currentSong = songsInAlbum.get(0);
                }else {
                    indexCurrentSong++;
                    currentSong = songsInAlbum.get(indexCurrentSong);}
                setAlbumContents();
            }
        });

    }
    private void playPreviousSong() {
        previousIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Song> songsInAlbum = album.getSongs();
                if (indexCurrentSong==0) {
                    indexCurrentSong = songsInAlbum.size()-1; //if on first position, get to the last one in the playlist
                    currentSong = songsInAlbum.get(indexCurrentSong);
                }else {
                    indexCurrentSong--;
                    currentSong = songsInAlbum.get(indexCurrentSong);}
                setAlbumContents();
            }
        });
    }

private void backToSongs (){
        backSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MusicPlayer.this,SongsActivity.class);
                //sending the same information as MainActivity, as Songs activity only needs the songs in the specific album
                i.putExtra("CurrentAlbum", album);

                startActivity(i);
            }
        });
}
}
