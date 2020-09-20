package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.UserNameService;
import org.springframework.stereotype.Controller;

@Controller
public class UserNameController {

    private final UserNameService userNameService;

    public UserNameController(UserNameService userNameService) {
        this.userNameService = userNameService;
    }

    public String showUser() {
        return userNameService.getUser();
    }
}