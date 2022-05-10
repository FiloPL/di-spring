package ttsw.filo.dispring.controllers;

import ttsw.filo.dispring.services.GreetingService;

/**
 * Created by T. Filo Zegarlicki on 10.05.2022
 **/

public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
