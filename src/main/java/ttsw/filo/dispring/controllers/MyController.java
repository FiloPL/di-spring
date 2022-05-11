package ttsw.filo.dispring.controllers;

import org.springframework.stereotype.Controller;
import ttsw.filo.dispring.services.GreetingService;

/**
 * Created by T. Filo Zegarlicki on 10.05.2022
 **/

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!! ");

        return greetingService.sayGreeting();
    }
}