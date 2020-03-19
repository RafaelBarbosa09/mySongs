package Model;

import java.util.Collection;
import java.util.UUID;

public class Album {

    private UUID id;
    private String name;
    private Artist artist;
    private Collection<Song> songs;


    public Album(){}

    public Album(UUID id, String name, Artist artist, Collection<Song> songs) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.songs = songs;
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

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Collection<Song> getSongs() {
        return songs;
    }

    public void setSongs(Collection<Song> songs) {
        this.songs = songs;
    }
}
