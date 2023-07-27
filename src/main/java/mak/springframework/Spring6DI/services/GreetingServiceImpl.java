package mak.springframework.Spring6DI.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service!!!";
    }
}
