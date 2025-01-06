package com.example.myproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/message")
    public String getMessage()
    {
        return "Hello from Spring!";
    }

    @PostMapping("/data")
    public String postData(@RequestBody String data)
    {
        System.out.println(data);
        return "Data received : "+ data;
    }
}
