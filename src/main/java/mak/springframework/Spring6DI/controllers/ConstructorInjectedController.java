package mak.springframework.Spring6DI.controllers;

import mak.springframework.Spring6DI.services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService greetingService;


    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
