package Model;

import java.util.Collection;
import java.util.UUID;

public class Artist {

    private UUID id;
    private String name;
    private Collection<Song> songs;
    private Collection<Album> albums;

    public Artist(){}

    public Artist(UUID id, String name, Collection<Song> songs, Collection<Album> albums) {
        this.id = id;
        this.name = name;
        this.songs = songs;
        this.albums = albums;
    }

    public Collection<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Collection<Album> albums) {
        this.albums = albums;
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

    public Collection<Song> getSongs() {
        return songs;
    }

    public void setSongs(Collection<Song> songs) {
        this.songs = songs;
    }
}
