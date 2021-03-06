package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// Commented below annotation as GreetingServiceConfig contains factory beans.
// It be better to have all bean as single place.
// @Primary
// @Profile("de")
// @Service
public class PrimaryGermanGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
