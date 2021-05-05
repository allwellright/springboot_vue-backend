package com.example1.springboot_vue.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
    @RequestMapping(value="/test")
    @CrossOrigin
    public String test(){
        return "ok";
    }
}
