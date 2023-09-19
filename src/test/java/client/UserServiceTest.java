package client;

import org.example.client.generated.UserService;
import org.example.client.generated.UserServiceImplService;
import org.example.client.generated.Gender;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {
    static UserServiceImplService service;
    static UserService userService;

    @BeforeAll
    static void setup() {
        service = new UserServiceImplService();
        userService = service.getUserServiceImplPort();
    }

    @Test
    void givenUserService_whenUserBob_thenGenderMALE() {
        assertEquals(Gender.MALE, userService.findByName("Bob").getGender());
    }

    @Test
    void givenUserService_whenUserMike_thenAgeCorrect() {
        assertEquals(22, userService.findByName("Mike").getAge());
    }

    @Test
    void names() {
        assertEquals(608000000, userService.findByName("Kate").getPhone());
    }
}
