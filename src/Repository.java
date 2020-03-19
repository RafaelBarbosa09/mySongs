import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface Repository<T> {

    T save(T entity);

    void remove(T entity);

    T update(T entity);

    List<T> getAll(T entity);

    Optional<T> getById(UUID id);
}