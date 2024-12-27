import java.util.*;

class Album {
    private String name;
    private int releaseYear;
    private List<Music> musics;

    public Album(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.musics = new ArrayList<>();
    }

    public void addMusic(Music music) {
        musics.add(music);
        System.out.println(music.getTitle() + " added to album " + name);
    }

    public void removeMusic(Music music) {
        musics.remove(music);
        System.out.println(music.getTitle() + " removed from album " + name);
    }

    public void displayInfo() {
        System.out.println("Album: " + name + " (" + releaseYear + ")");
        for (Music music : musics) {
            music.displayInfo();
        }
    }

    public List<Music> getMusics() {
        return musics;
    }

    public String getName() {
        return name;
    }
}
