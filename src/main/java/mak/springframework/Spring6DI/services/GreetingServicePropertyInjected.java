package mak.springframework.Spring6DI.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injection!";//Arkadaşlar, arkadaşlara ozellik enjeksiyonuna izin vermeyin!
    }
}
