package ttsw.filo.dispring.services;

import org.springframework.stereotype.Component;

/**
 * Created by T. Filo Zegarlicki on 11.05.2022
 **/

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {

        return "Primärer Grußdienst";

    }
}
