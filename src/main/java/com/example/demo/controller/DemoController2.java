package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController2 {
    @RequestMapping("/nowprint")
    public int makeInteger(){
        return 36;
    }

    @RequestMapping("/makers")
    public String makeNoise(){
        return "You are the superhero..";
    }

    @RequestMapping("/set")
    public String setOut(){
        return "But, can we meet out?";
    }

    @RequestMapping("/yoursalary")
    public double salary(){
        return 250000.500;
    }
}
