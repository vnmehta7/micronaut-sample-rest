package micronaut.sample.service;

public interface GreetingService {
    default String getGreeting(){
        return "Hi";
    }
}
