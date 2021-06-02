package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello world");
        System.out.println("hello world !");
        System.out.println("hello world hot 1");
        System.out.println("hello world master test");
        System.out.println("hello world hot test");
        System.out.println("hello world push test");
        System.out.println("hello world pull test");
        return "hello world";
    }
}
