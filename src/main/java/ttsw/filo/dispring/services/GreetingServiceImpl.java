package ttsw.filo.dispring.services;

import org.springframework.stereotype.Service;

/**
 * Created by T. Filo Zegarlicki on 10.05.2022
 **/
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_FILO = "Hello Gurus!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_FILO;
    }
}
