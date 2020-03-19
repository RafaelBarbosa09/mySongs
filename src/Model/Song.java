package Model;

import java.util.UUID;

public class Song {

    private UUID id;
    private String name;
    private String genre;
    private Artist artist;
    private Album album;

    public Song(){}

    public Song(UUID id, String name, String genre, Artist artist, Album album) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.artist = artist;
        this.album = album;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
