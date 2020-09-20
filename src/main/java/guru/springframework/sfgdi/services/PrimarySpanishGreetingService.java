package guru.springframework.sfgdi.services;

import com.sun.org.glassfish.external.probe.provider.annotations.Probe;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// Commented below annotation as GreetingServiceConfig contains factory beans
// It be better to have all bean as single place.
// @Primary
// @Profile("es")
// @Service
public class PrimarySpanishGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
