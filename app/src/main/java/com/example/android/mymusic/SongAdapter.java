package com.example.android.mymusic;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Maria on 26.02.2018.
 */

public class SongAdapter extends ArrayAdapter {
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View songView = convertView;
        //inflate a view if one doesn't already exist
        if (songView == null){
            songView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_view, parent, false);
        }
        Song currentSong = (Song) getItem(position);
        //set text view for the current song

        TextView songName = songView.findViewById(R.id.song_title);
        songName.setText(currentSong.getName());

        return songView;
    }
    public SongAdapter(Activity context, ArrayList<Song> songList){
        super(context, 0 , songList);
    }

}
