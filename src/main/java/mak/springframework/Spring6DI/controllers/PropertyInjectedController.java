package mak.springframework.Spring6DI.controllers;

import mak.springframework.Spring6DI.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    GreetingService greetingService;

    public String sayHello() {
       return greetingService.sayGreeting();
    }
}
