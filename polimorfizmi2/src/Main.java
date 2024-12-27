public class Main {
    public static void main(String[] args) {
        Music song1 = new Music("Imagine", 3.5, "Pop");
        Music song2 = new Music("Bohemian Rhapsody", 5.9, "Rock");
        Music song3 = new Music("Shape of You", 4.0, "Pop");

        Album album1 = new Album("Greatest Hits", 1995);
        album1.addMusic(song1);
        album1.addMusic(song2);

        Album album2 = new Album("Chartbusters", 2020);
        album2.addMusic(song3);

        Artist artist1 = new Artist("Queen");
        artist1.addAlbum(album1);

        Artist artist2 = new Artist("Ed Sheeran");
        artist2.addAlbum(album2);

        MusicLibrary library = new MusicLibrary();
        library.addArtist(artist1);
        library.addArtist(artist2);

        library.addAlbum(album1);
        library.addAlbum(album2);

        library.searchMusic("Imagine");

        Music randomSong = library.giveRandomMusic();
        if (randomSong != null) {
            randomSong.play();
            randomSong.stop();
        }

        artist1.displayInfo();
        library.removeAlbum(album1);
    }
}
