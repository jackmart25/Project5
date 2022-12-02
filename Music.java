import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class will hold all my methods to make a music library and playlist.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Music
{
    // instance variables (each of these variables are needed 
    // to create a music library.
    private String song;
    private String artist;
    private double songLength;
    private String album;
    private Genre genre;
    private ArrayList<String> playlist = new ArrayList<>();
    

    /**
     * Constructor for objects of class music
     */
    public Music()
    {
        // initialise instance variables
        song = " ";
        artist = " ";
        songLength = -1;
        album = " ";
        playlist = new ArrayList<>();
    }
    /**
     * this constructor allows me and the user to 
     * input instance variables :)
     */
    public Music(String song, String artist, double songLength, String album, Genre genre) {
        this.song = song;
        this.artist = artist;
        this.songLength = songLength;
        this.album = album;
        this.genre = genre;
        playlist = new ArrayList<>();
    }
    /**
     * Below I will write accessor methods and mutator methods.
     */
    public String getSong() {
        return song;
    }
    public String getArtist() {
        return artist;
    }
    public double getSongLength() {
        return songLength;
    }
    public String getAlbum() {
        return album;
    }
    public Genre getGenre() {
        return genre;
    }
    public void setSong (String s) {
        song = s;
    }
    public void setArtist(String a) {
        artist = a;
    }
    public void setSongLength(double sL) {
        songLength = sL;
    }
    public void setAlbum(String alb) { //album for short
        album = alb;
    }
    public void setGenre(Genre g) {
        genre = g;
    }
    public String toString() {//puts all the information about the song together.
        return this.song = song + " by " + this.artist + " is " + this.songLength + " minutes and seconds long. The album is called " + this.album + ". The genre is " + this.genre + "."; 
    }
    public ArrayList<String>getPlaylist() {
     return playlist;   
    }
    public void addPlaylist(String playlists) {
        this.playlist.add(playlists);
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  removePlaylist 
     * @return   removes playlists added
     */
    public void removePlaylist(String playlists) {
        if (playlist.contains(playlist)) {
            playlist.remove(playlists);
        }
    }
    /**
     *
     * @param  getGenre/Scanner in
     * @return  String/genre name
     */
    public static Genre getGenre(Scanner in) {
            System.out.println("All genres of music available: ");
            for (Genre g : Genre.values()) {
                System.out.println(g);
            }
            System.out.println("Enter a genre that is available: ");
            String genre = in.nextLine();
            Genre input = Genre.valueOf(genre.toUpperCase());
            if (input != null) {
                return input;
            } else {
                return Genre.UNKNOWN;
            }  
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */}
    }