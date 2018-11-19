package com.cg.starter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    /**
     * For Testing
     * @return String
     */
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World!";
    }
}
