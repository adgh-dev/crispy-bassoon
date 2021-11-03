package ro.pakt.javadi.services;

public class GreetingServiceImplementation implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World!";
    }
}
