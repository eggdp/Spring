package com.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController {
    @RequestMapping("/hello")
    String home() {
        return "Hello World!";
    }
    @RequestMapping("/hellokr")
    String hello() {
        return "헬로 월드!";
    }
}
