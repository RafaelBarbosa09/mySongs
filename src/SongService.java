import Model.Song;

public class SongService {

    private SongRepository songRepository;

    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public void saveSong() {

        Song song = new Song();

        //atributos setados...

        songRepository.save(song);
    }
}
