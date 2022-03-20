package composition;

import java.util.List;

/**
 * @author Cintia
 * @since 19/03/2022
 */

public class totalSong {
    private final List<Song> songs;
    
    totalSong(List<Song> songs){
        this.songs = songs;
    }

    public List<Song> getTotalSongs() {
        return songs;
    }
}
