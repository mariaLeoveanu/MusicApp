package com.example.android.mymusic;

import java.util.ArrayList;

/**
 * Created by Maria on 06.03.2018.
 */

public class ReturnSongs {

   ArrayList<Song> songList = new ArrayList<>();

   public ReturnSongs() {

   }


   public ArrayList getAlbumList(int index) {
      switch (index) {

         case 0: {
            songList.add(new Song("BLOOD", "Kendrick Lamar", R.drawable.damn, "1:58"));
            songList.add(new Song("DNA", "Kendrick Lamar", R.drawable.damn, "3:05"));
            songList.add(new Song("YAH", "Kendrick Lamar", R.drawable.damn, "2:40"));
            songList.add(new Song("ELEMENT", "Kendrick Lamar", R.drawable.damn, "3:29"));
            songList.add(new Song("FEEL", "Kendrick Lamar", R.drawable.damn, "3:35"));
            songList.add(new Song("LOYALTY", "Kendrick Lamar", R.drawable.damn, "3:48"));
            songList.add(new Song("PRIDE", "Kendrick Lamar", R.drawable.damn, "4:35"));
            songList.add(new Song("HUMBLE", "Kendrick Lamar", R.drawable.damn, "2:57"));
            songList.add(new Song("LUST", "Kendrick Lamar", R.drawable.damn, "5:08"));
            songList.add(new Song("LOVE", "Kendrick Lamar", R.drawable.damn, "3:33"));
            songList.add(new Song("XXX", "Kendrick Lamar", R.drawable.damn, "4:14"));
            songList.add(new Song("FEAR", "Kendrick Lamar", R.drawable.damn, "7:41"));
            songList.add(new Song("GOD", "Kendrick Lamar", R.drawable.damn, "4:09"));
            break;
         }
         case 1: {
            songList.add(new Song("Free Smoke", "Drake", R.drawable.morelife, "2:34"));
            songList.add(new Song("No long talk", "Drake", R.drawable.morelife, "2:30"));
            songList.add(new Song("Passionfruit", "Drake", R.drawable.morelife, "4:59"));
            songList.add(new Song("Jorja interlude", "Drake", R.drawable.morelife, "1:48"));
            songList.add(new Song("Get it together", "Drake", R.drawable.morelife, "4:10"));
            songList.add(new Song("Madiba Riddim", "Drake", R.drawable.morelife, "3:25"));
            songList.add(new Song("Blem", "Drake", R.drawable.morelife, "3:37"));
            songList.add(new Song("4422", "Drake", R.drawable.morelife, "3:06"));
            songList.add(new Song("Gyalchester", "Drake", R.drawable.morelife, "3:09"));
            songList.add(new Song("Skepta interlude", "Drake", R.drawable.morelife, "2:23"));
            songList.add(new Song("Portland", "Drake", R.drawable.morelife, "3:57"));
            songList.add(new Song("Sacrifices", "Drake", R.drawable.morelife, "5:08"));
            songList.add(new Song("Nothings into somethings", "Drake", R.drawable.morelife, "2:34"));
            songList.add(new Song("Teenage fever", "Drake", R.drawable.morelife, "3:40"));
            songList.add(new Song("KMT", "Drake", R.drawable.morelife, "2:43"));
            songList.add(new Song("Lose you", "Drake", R.drawable.morelife, "5:05"));
            songList.add(new Song("Can't have everything", "Drake", R.drawable.morelife, "3:49"));
            songList.add(new Song("Glow", "Drake", R.drawable.morelife, "3:26"));
            songList.add(new Song("Since way back", "Drake", R.drawable.morelife, "6:08"));
            songList.add(new Song("Free Smoke", "Drake", R.drawable.morelife, "2:34"));
            songList.add(new Song("Fake love", "Drake", R.drawable.morelife, "3:31"));
            songList.add(new Song("Ice melts", "Drake", R.drawable.morelife, "4:11"));
            songList.add(new Song("Do not disturb", "Drake", R.drawable.morelife, "4:44"));
            break;
         }
         case 2: {
            songList.add(new Song("The getaway", "Red Hot Chili Peppers", R.drawable.thegetaway, "4:10"));
            songList.add(new Song("Dark necessities", "Red Hot Chili Peppers", R.drawable.thegetaway, "5:02"));
            songList.add(new Song("We turn red", "Red Hot Chili Peppers", R.drawable.thegetaway, "3:20"));
            songList.add(new Song("The longest wave", "Red Hot Chili Peppers", R.drawable.thegetaway, "3:31"));
            songList.add(new Song("Goodbye angels", "Red Hot Chili Peppers", R.drawable.thegetaway, "4:29"));
            songList.add(new Song("Sick love", "Red Hot Chili Peppers", R.drawable.thegetaway, "3:41"));
            songList.add(new Song("Go robot", "Red Hot Chili Peppers", R.drawable.thegetaway, "4:24"));
            songList.add(new Song("Feasting on the flowers", "Red Hot Chili Peppers", R.drawable.thegetaway, "3:23"));
            songList.add(new Song("Detroit", "Red Hot Chili Peppers", R.drawable.thegetaway, "3:47"));
            songList.add(new Song("This ticonderoga", "Red Hot Chili Peppers", R.drawable.thegetaway, "3:35"));
            songList.add(new Song("Encore", "Red Hot Chili Peppers", R.drawable.thegetaway, "4:15"));
            songList.add(new Song("The hunter ", "Red Hot Chili Peppers", R.drawable.thegetaway, "4:00"));
            songList.add(new Song("Dreams of a samurai", "Red Hot Chili Peppers", R.drawable.thegetaway, "6:09"));
            break;
         }
         case 3:{
            songList.add(new Song("Flip", "Glass Animals",R.drawable.zaba, "3:43"));
            songList.add(new Song("Black mambo", "Glass Animals", R.drawable.zaba,"4:09"));
            songList.add(new Song("Pools", "Glass Animals", R.drawable.zaba,"4:49"));
            songList.add(new Song("Gooey", "Glass Animals", R.drawable.zaba,"4:49"));
            songList.add(new Song("Walla walla", "Glass Animals", R.drawable.zaba,"3:37"));
            songList.add(new Song("Intruxx", "Glass Animals",R.drawable.zaba,"2:49"));
            songList.add(new Song("Hazey", "Glass Animals",R.drawable.zaba, "4:26"));
            songList.add(new Song("Toes", "Glass Animals",R.drawable.zaba,"4:15"));
            songList.add(new Song("Wyrd", "Glass Animals",R.drawable.zaba,"4:06"));
            songList.add(new Song("Cocoa hooves", "Glass Animals",R.drawable.zaba,"4:32"));
            songList.add(new Song("JDNT", "Glass Animals",R.drawable.zaba, "4:24"));
         }

      }
      return songList;
   }
}