package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobUIController {

    @GetMapping("/abcxyz123")
    public String test() {
        return "NELLO TEST SUCCESS";
    }
}