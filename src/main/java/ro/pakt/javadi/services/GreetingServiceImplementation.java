package ro.pakt.javadi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImplementation implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World!";
    }
}
