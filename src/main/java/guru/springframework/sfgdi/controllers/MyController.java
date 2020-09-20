package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    /*public String sayHello(){
        System.out.println("Hello World !!!");
        return "Hi Tarun";
    }*/

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    public String getGreeting(){

        return greetingService.sayGreeting();
    }
}