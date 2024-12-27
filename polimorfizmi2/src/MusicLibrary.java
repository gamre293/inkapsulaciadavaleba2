import java.util.*;

class MusicLibrary {
    private List<Artist> artists;
    private List<Album> albums;
    private List<Music> songs;

    public MusicLibrary() {
        this.artists = new ArrayList<>();
        this.albums = new ArrayList<>();
        this.songs = new ArrayList<>();
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
        System.out.println("Artist " + artist.getName() + " added to library.");
    }

    public void removeArtist(Artist artist) {
        artists.remove(artist);
        System.out.println("Artist " + artist.getName() + " removed from library.");
    }

    public void addAlbum(Album album) {
        albums.add(album);
        songs.addAll(album.getMusics());
        System.out.println("Album " + album.getName() + " added to library.");
    }

    public void removeAlbum(Album album) {
        albums.remove(album);
        songs.removeAll(album.getMusics());
        System.out.println("Album " + album.getName() + " removed from library.");
    }

    public void addSong(Music music) {
        songs.add(music);
        System.out.println("Song " + music.getTitle() + " added to library.");
    }

    public void removeSong(Music music) {
        songs.remove(music);
        System.out.println("Song " + music.getTitle() + " removed from library.");
    }

    public void searchMusic(String title) {
        for (Music music : songs) {
            if (music.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found song: " + title);
                music.play();
                return;
            }
        }
        System.out.println("Song " + title + " not found.");
    }

    public Music giveRandomMusic() {
        if (!songs.isEmpty()) {
            Random random = new Random();
            Music randomMusic = songs.get(random.nextInt(songs.size()));
            System.out.println("Random music: " + randomMusic.getTitle());
            return randomMusic;
        }
        System.out.println("No songs in library.");
        return null;
    }
}
