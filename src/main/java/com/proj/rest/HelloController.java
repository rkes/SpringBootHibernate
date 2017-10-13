package com.proj.rest;

/**
 * Created by rara0916 on 10/13/2017.
 */
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/test")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}