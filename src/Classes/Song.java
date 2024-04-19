package Classes;

import Enums.Genre;

public class Song {
    private String name;
    private SongLength length;
    private Genre genre;
    private Album album;
    private Artist featuredArtist;

    public Song(String name, SongLength length, Genre genre, Album album, Artist featuredArtist) {
        this.name = name;
        this.length = length;
        this.genre = genre;
        this.album = album;
        this.featuredArtist = featuredArtist;
    }

    @Override
    public String toString() {
        return name +
                "\n" + length +
                "\n" + genre +
                "\n" + album + hasFeaturedArtist();
    }

    private String hasFeaturedArtist() {
        if (featuredArtist != null) {
            return " \nft. " + featuredArtist;
        } else
        {
            return "";
        }
    }
}
