package com.example.show.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {

    @GetMapping("/show")
    public String show(){
        return "hello show";
    }
}
