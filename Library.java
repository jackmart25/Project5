import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class Library here. 
 *
 * @Jackie Martinez
 * @version (a version number or a date)
 */
public class Library
{
    public static void main(String[] args){
        /**
         * Below I am testing to make sure my methods work. I added 20 
         * existing songs to see if I can get a certain element such as
         * the artist.
         */
        Scanner scnr = new Scanner(System.in);
        Music test = new Music();
        test.setSong("Tequila");
        test.setArtist("The Champs");
        test.setSongLength(2.09);
        test.setAlbum("Greatest Hits / Tequila");
        test.setGenre(Genre.ROCK);
        System.out.println(test);
        Music song1 = new Music("Scar Tissue","Red Hot Chili Peppers",3.37,"Californication", Genre.ALTERNATIVE);
        Music song2 = new Music("All I Want For Christmas is You","Mariah Carey",4.02,"Merry Christmas", Genre.HOLIDAY);
        Music song3 = new Music("You Know How We Do It","Ice Cube",3.53,"Lethal Injection", Genre.HIPHOP);
        Music song4 = new Music("My Way","Frank Sinatra",4.34,"Ultimate Sinatra", Genre.JAZZ);
        Music song5 = new Music("Neverita","Bad Bunny",2.53,"Un Verano Sin Ti", Genre.LATIN);
        Music song6 = new Music("I Like The Way You Love Me","Brenton Wood",2.43,"18 Best", Genre.SOUL);
        Music song7 = new Music("One Kiss","Calvin Harris and Dua Lipa",3.35,"One Kiss - Single", Genre.DANCE);
        Music song8 = new Music("Africa","Toto",4.55,"Toto IV", Genre.ROCK);
        Music song9 = new Music("Last Christmas","Wham!",4.23,"Last Christmas - Single", Genre.HOLIDAY);
        Music song10 = new Music("The Moment","Tame Impala",4.15,"Currents", Genre.ALTERNATIVE);
        Music song11 = new Music("Doomsday","MF DOOM",4.58,"Operation Doomsday", Genre.HIPHOP);
        Music song12 = new Music("Everybody Loves the Sunshine","Roy Ayers Ubiquity",4.02,"Everybody Loves the Sunshine", Genre.JAZZ);
        Music song13 = new Music("Corazon Culpable","Anthony Santos",6.00,"Cohelo Ahi", Genre.LATIN);
        Music song14 = new Music("Is it Any Wonder?","Durand Jones & the Indications",4.37,"Deluxe Edition", Genre.SOUL);
        Music song15 = new Music("I feel Love","Donna Summer",5.53,"Casablanca", Genre.DANCE);
        Music song16 = new Music("Are you gonna be my girl?","Jet",3.35,"Are You Gonna Be My Girl - EP", Genre.ROCK);
        Music song17 = new Music("Jingle Bell Rock","Bobby Helms",2.11,"Jingle Bell Rock", Genre.HOLIDAY);
        Music song18 = new Music("Do I Wanna Know?","Artic Monkeys",4.32,"AM", Genre.ALTERNATIVE);
        Music song19 = new Music("DNA.","Kendrick Lamar",3.06,"DAMN.", Genre.HIPHOP);
        Music song20 = new Music("Oh Honey","Delegation",5.56,"Oh Honey - Single", Genre.SOUL);
        
        // this is the arraylist for songs that are just added 
        // for example when you add a song to your ipod but
        // not necessarily a playlist. This is more testing to 
        // make sure my methods are working properly.
        /**
         * an arraylist for addedSongs
         */
        ArrayList<Music> addedSongs = new ArrayList<>();
        System.out.println("The artist I currently have added are:");
        addedSongs.add(song2);
        addedSongs.add(song4);
        addedSongs.add(song6);
        addedSongs.add(song10);
        addedSongs.add(song15);
    
        String seeArtistAdded = addedSongs.get(0).getArtist();
        /**
         * this for loop outputs the artist names of what I have added
         * so far.
         */
    
        for (int i = 0; i < addedSongs.size(); i++) {
            System.out.println(addedSongs.get(i).getArtist());
        }
        /**
         * These are the outputs of this program. It asks for each 
         * part of song.
         */
        Music songAdded = new Music();
        System.out.println("Enter the name of your playlist: ");
        String nameOfPlaylist = scnr.nextLine();
        
        System.out.print("Enter the name of the song: ");
        String song = scnr.nextLine();
        
        System.out.print("Enter the artist of the song: ");
        String artist = scnr.nextLine();
        
        System.out.print("Enter the name of the album: ");
        String album = scnr.nextLine();
        
        System.out.print("Enter the length of the song: (In this format 0.00) ");
        double length = scnr.nextDouble();

        scnr.nextLine();
        
        Genre genre = getGenre(scnr);
        Music newSong = new Music(song, artist, length, album, genre);
        System.out.println("Your " + nameOfPlaylist + " playlist has " + newSong);
    }
    /*
     * this method allows the user obtain a genre available
     * param: getGenre/Scanner in
     * returns the name of the genre 
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
}
}
