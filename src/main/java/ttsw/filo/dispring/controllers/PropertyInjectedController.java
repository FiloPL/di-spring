package ttsw.filo.dispring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ttsw.filo.dispring.services.GreetingService;
import ttsw.filo.dispring.services.GreetingServiceImpl;

/**
 * Created by T. Filo Zegarlicki on 10.05.2022
 **/

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}