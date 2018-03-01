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
 * Created by Maria on 25.02.2018.
 */

public class AlbumAdapter extends ArrayAdapter<Album> {

    public AlbumAdapter(Activity context, ArrayList<Album> albumList) {
        super(context, 0, albumList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View albumView = convertView;
        if (albumView == null) {
            //inflate a view if one doesn't already exist
            albumView = LayoutInflater.from(getContext()).inflate(
                    R.layout.album_view, parent, false);
        }
        Album al = getItem(position);

        //set images and texts for the textviews and imageviews for albums

        ImageView albumImage = (ImageView) albumView.findViewById(R.id.album_art_iv);
        albumImage.setImageResource(al.getAlbumArt());

        TextView albumName = (TextView) albumView.findViewById(R.id.album_name_tv);
        albumName.setText(al.getAlbumName());

        TextView artistName = (TextView) albumView.findViewById(R.id.artist_tv);
        artistName.setText(al.getArtist());

        TextView numSongs = (TextView) albumView.findViewById(R.id.album_songs_number_tv);
        numSongs.setText(al.getNumberOfSongs() + " songs");

        return albumView;
    }
}
