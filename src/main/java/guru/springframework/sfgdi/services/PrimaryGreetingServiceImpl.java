package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created for I18n language service testing using @Qualifier, @Primary service.
 *
 * While running application with factory beans, error was coming with creating MyController bean.
 * That was because here we had defined this class as @Primary bean.
 */
// @Primary
// @Service
public class PrimaryGreetingServiceImpl implements  GreetingService {
    @Override
    public String sayGreeting() {
        return "Say Hello - Primary";
    }
}
