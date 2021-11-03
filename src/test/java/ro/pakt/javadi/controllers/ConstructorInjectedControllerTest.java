package ro.pakt.javadi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.pakt.javadi.services.GreetingServiceImplementation;

public class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new ConstructorInjectedController(
            new GreetingServiceImplementation());
    }

    @Test
    void testGetGreeting() {
        System.out.println(controller.getGreeting());
    }
}
