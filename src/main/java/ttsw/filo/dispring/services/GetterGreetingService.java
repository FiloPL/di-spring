package ttsw.filo.dispring.services;

import org.springframework.stereotype.Service;

/**
 * Created by T. Filo Zegarlicki on 11.05.2022
 **/

@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}