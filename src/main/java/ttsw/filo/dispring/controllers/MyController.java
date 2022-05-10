package ttsw.filo.dispring.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by T. Filo Zegarlicki on 10.05.2022
 **/

@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello!!! ");

        return "foo";
    }
}