package ttsw.filo.dispring.controllers;

import ttsw.filo.dispring.services.GreetingServiceImpl;

/**
 * Created by T. Filo Zegarlicki on 10.05.2022
 **/

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}