package mak.springframework.Spring6DI.controllers;

import mak.springframework.Spring6DI.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
      return   greetingService.sayGreeting();
    }
}
