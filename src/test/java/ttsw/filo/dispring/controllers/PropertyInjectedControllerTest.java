package ttsw.filo.dispring.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ttsw.filo.dispring.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by T. Filo Zegarlicki on 10.05.2022
 **/


public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    public void setUp() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_FILO, propertyInjectedController.sayHello());
    }
}