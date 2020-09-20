package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {


    // best practice is to use private final modifiers so that it can be initialized
    // only once using Constructor initialization.
    private final GreetingService greetingService;

    // Autowiring is optional for constructor injected controller. This need to be autowired.
    // Since spring4 there is no need to provide autowired annotation.
    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
