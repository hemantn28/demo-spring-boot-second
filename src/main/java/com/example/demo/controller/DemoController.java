package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
//ENDPOINT
    @RequestMapping("/hello")
    public void message(){
        System.out.println("Hello, Welcome to Spring Boot..");
    }

    @RequestMapping("/hi")
    public String hello(){
        return "This is my second spring boot app..";
    }
@RequestMapping("/print")
    public int returnInteger(){
        return 9;
    }

    @RequestMapping("/printinfo")
    public double returnDouble(){
        return 18.9;
    }
    @RequestMapping("/printset")
    public String makeStatement(){
        return "You are great..";
    }
    @RequestMapping("/printnow")
    public String write(){
        return "How are you?";
    }
}
