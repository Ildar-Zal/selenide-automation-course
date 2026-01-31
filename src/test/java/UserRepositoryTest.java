import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class UserRepositoryTest {

    UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        Faker faker = new Faker();
        String randomName = faker.name().firstName();
        String randomEmail = faker.internet().emailAddress();
        User user = new User(1, randomName, randomEmail);
        HashMap<Integer, User> users = new HashMap<>();
        users.put(user.id(), user);
        userRepository = new InMemoryUserRepository(users);
    }

    @Test
    public void shouldFindUser() {
        Optional<User> result = userRepository.findById(1);
        User user = result.get();
        Assertions.assertTrue(result.isPresent());
        Assertions.assertNotNull(user.name());
        Assertions.assertFalse(user.name().isEmpty());

        System.out.println(user.name());
    }

    @Test
    public void shouldntFindUser() {
        Optional<User> result = userRepository.findById(99);
        Assertions.assertTrue(result.isEmpty(), "Ошибка: Ожидали пустой результат для ID 99");
    }

    @Test
    public void shouldThrowExceptionForNegativeId() {
        assertThrows(IllegalArgumentException.class, () ->
                userRepository.findById(0));
    }
}
