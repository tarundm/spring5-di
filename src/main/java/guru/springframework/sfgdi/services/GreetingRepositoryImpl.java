package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {


    @Override
    public String getEnglishGreeting() {
        return "Hello - English Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hello - Spanish Greeting service. Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {

        return "Hello - German Greeting service. Primärer Grußdienst";

    }
}
