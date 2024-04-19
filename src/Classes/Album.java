package Classes;

public class Album {
    private Integer releaseYear;
    private String title;
    private Artist artist;

    public Album(Integer releaseYear, String title, Artist artist) {
        this.releaseYear = releaseYear;
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Album{" +
                "\nTitle: " + title +
                "\nRelease: " + releaseYear +
                "\nArtist: " + artist +
                "\n}";
    }
}
