package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.UserNameServiceImpl;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class UserNameControllerTest {

    private UserNameController userNameController;

    @BeforeEach
    void setUp() {
        System.out.println("UserNameControllerTest - Test Start");
        userNameController = new UserNameController(new UserNameServiceImpl());
    }

    @AfterEach
    void tearDown() {
        System.out.println("UserNameControllerTest - Test Ends");
    }

    @Test
    void showUser() {
        System.out.println(userNameController.showUser());
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("UserNameControllerTest - Before All Test Start");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("UserNameControllerTest - Before All Test End");
    }
}