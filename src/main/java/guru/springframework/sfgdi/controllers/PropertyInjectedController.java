package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// This annotation tells Spring that it is spring based component otherwise BeanNotFoundException will be coming.
@Controller
public class PropertyInjectedController {

    // Spring doesn't know to inject greeting service so this annotation tells that instance of GreetingService should be injected
    @Qualifier(value = "propertyGreetingServiceImpl")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
