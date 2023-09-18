package com.web.springboot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @ResponseBody
    @GetMapping("/")
    public String rootPath() {
        return "这是一个主页";
    }
}
