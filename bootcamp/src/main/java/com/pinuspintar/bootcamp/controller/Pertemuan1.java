package com.pinuspintar.bootcamp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pertemuan1 {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
