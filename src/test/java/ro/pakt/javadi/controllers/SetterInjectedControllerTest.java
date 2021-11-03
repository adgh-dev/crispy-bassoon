package ro.pakt.javadi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.pakt.javadi.services.GreetingServiceImplementation;

public class SetterInjectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImplementation());
    }

    @Test
    void testGetGreeting() {
        System.out.println(controller.getGreeting());
    }
}
