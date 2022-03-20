package composition;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cintia
 * @since 19/03/2022
 */

public class Composition {
    public static void main(String[] args) {
        Song s1 = new Song("Hati-Hati Dijalan", "Tulus", "3 Maret 2022");
        Song s2 = new Song("Mesin Waktu", "Budi Doremi", "1 April 2021");
        Song s3 = new Song("Tutur Batin", "Yura Yunita", "22 Oktober 2021");
        Song s4 = new Song("Selamat Tinggal", "Virgoun feat Audy", "19 Desember 2018");
        
        List<Song> songs = new ArrayList<Song>();
        songs.add(s1);
        songs.add(s2);
        songs.add(s3);
        songs.add(s4);
        
        totalSong tsong = new totalSong(songs);
        List<Song> s = tsong.getTotalSongs();
        
        System.out.println("\tList Songs");
        System.out.println("==========================");
        for(Song sg : s){
            System.out.println("Title   : " + sg.title);
            System.out.println("Singer  : " + sg.singer);
            System.out.println("Release : " + sg.release);
            System.out.println(" ");
        }
        
    }
    
}
