package com.web.springboot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String rootPath() {
        return "http://127.0.0.1:8080/";
    }
}
