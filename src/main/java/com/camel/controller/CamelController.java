package com.camel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CamelController {
    
    @RequestMapping("/hello")
    public String hello() {
        return "hello,world";
    }
}
