import Model.ConexaoDb;
import Model.Song;

import java.sql.*;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class SongRepository implements Repository<Song> {
    @Override
    public Song save(Song song) {

        try(Connection con = ConexaoDb.conectar()) {

            String sql = " INSERT INTO Song (name, genre, artist_id, album_id)" +
                         " VALUES (?, ?, ?, ?)";

            PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet generatedKeys = stmt.getGeneratedKeys();
            generatedKeys.next();

            stmt.setString(1, song.getName());
            stmt.setString(2, song.getGenre());
            stmt.setObject(3, song.getArtist().getId());
            stmt.setObject(4, song.getAlbum().getId());

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return song;
    }

    @Override
    public void remove(Song song) {

    }

    @Override
    public Song update(Song song) {
        return null;
    }

    @Override
    public List<Song> getAll(Song song) {
        return null;
    }

    @Override
    public Optional<Song> getById(UUID id) {
        return Optional.empty();
    }
}
