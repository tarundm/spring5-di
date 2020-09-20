package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created for I18n Spanish service testing using @Qualifier, @Primary service.
 */
// Commented for testing Bean Factory Method. Issue was coming with ES configuration
// @Profile({"ES", "default"})
// @Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Halo Mundo - ES";
    }
}
