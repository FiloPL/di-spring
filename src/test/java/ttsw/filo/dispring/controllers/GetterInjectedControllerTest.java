package ttsw.filo.dispring.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ttsw.filo.dispring.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by T. Filo Zegarlicki on 11.05.2022
 **/

public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @BeforeEach
    public void setUp() {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_FILO, getterInjectedController.sayHello());
    }
}