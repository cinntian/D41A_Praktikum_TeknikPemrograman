package composition;

/**
 * @author Cintia
 * @since 19/03/2022
 */

public class Song {
    public String title;
    public String singer;
    public String release;
    
    Song(String title, String singer, String release){
        this.title = title;
        this.singer = singer;
        this.release = release;
    }
}
