class Music extends Playable {
    private String title;
    private double duration;
    private String genre;
    private boolean isPlaying;

    public Music(String title, double duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.isPlaying = false;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public void play() {
        if (!isPlaying) {
            isPlaying = true;
            System.out.println("Playing: " + title);
        } else {
            System.out.println(title + " is already playing.");
        }
    }

    public void stop() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Stopped: " + title);
        } else {
            System.out.println(title + " is not playing.");
        }
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Duration: " + duration + " mins, Genre: " + genre);
    }
}
