import java.util.*;

class Artist {
    private String name;
    private List<Album> albums;

    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    public void addAlbum(Album album) {
        albums.add(album);
        System.out.println("Album " + album.getName() + " added to artist " + name);
    }

    public void removeAlbum(Album album) {
        albums.remove(album);
        System.out.println("Album " + album.getName() + " removed from artist " + name);
    }

    public void displayInfo() {
        System.out.println("Artist: " + name);
        for (Album album : albums) {
            album.displayInfo();
        }
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public String getName() {
        return name;
    }
}

