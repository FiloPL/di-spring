package ttsw.filo.dispring.controllers;

import ttsw.filo.dispring.services.GreetingService;

/**
 * Created by T. Filo Zegarlicki on 10.05.2022
 **/

public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}