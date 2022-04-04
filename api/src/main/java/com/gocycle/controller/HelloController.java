package com.gocycle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // shorthand for @Controller and @ResponseBody rolled together
public class HelloController {

    @RequestMapping( "/hello" )
    public String echo() {
        return "Hello World!";
    }

}
