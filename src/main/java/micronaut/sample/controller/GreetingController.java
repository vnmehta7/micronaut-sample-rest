package micronaut.sample.controller;

import io.micronaut.context.annotation.Requires;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import micronaut.sample.service.GreetingService;

import javax.inject.Inject;

@Controller("/greet")
public class GreetingController {

    @Inject
    private GreetingService greetingService;

    @Get
    public String greet() {
        return greetingService.getGreeting();
    }

    @Post(value = "/{name}", consumes = MediaType.TEXT_PLAIN)
    public String setGreeting(@Body String name) {
        return greetingService.getGreeting() +" "+ name;
    }
}
