package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created for I18n English service testing using @Qualifier, @Primary service.
 */
// Commented for testing Bean Factory Method. Issue was coming with ES configuration
// @Profile("EN")
// @Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{

    public String sayGreeting(){
        return "Say Hello - EN";
    }
}
