import java.util.HashMap;
import java.util.Optional;

public class InMemoryUserRepository implements UserRepository<User> {

    HashMap<Integer,User> users;
    public InMemoryUserRepository(HashMap<Integer,User> users){
        this.users = users;
    }
    @Override
    public Optional<User> findById(int id) {
        if (id<=0){
            throw new IllegalArgumentException("id меньше единицы!");
        }
        User user = users.get(id);
        return Optional.ofNullable(user);
    }
}
