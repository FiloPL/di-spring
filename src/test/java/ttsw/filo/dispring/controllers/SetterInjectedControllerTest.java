package ttsw.filo.dispring.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ttsw.filo.dispring.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by T. Filo Zegarlicki on 10.05.2022
 **/
public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @BeforeEach
    public void setUp() {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_FILO, setterInjectedController.sayHello());
    }
}