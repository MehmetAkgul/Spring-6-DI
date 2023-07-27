package mak.springframework.Spring6DI.controllers;

import mak.springframework.Spring6DI.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
       return greetingService.sayGreeting();
    }
}
