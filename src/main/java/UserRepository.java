import java.util.Optional;

public interface UserRepository<T> {
    public Optional<T> findById(int id);
}
