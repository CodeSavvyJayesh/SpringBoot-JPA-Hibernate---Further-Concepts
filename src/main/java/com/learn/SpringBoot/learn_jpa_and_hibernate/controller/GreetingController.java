package com.learn.SpringBoot.learn_jpa_and_hibernate.controller;

import com.learn.SpringBoot.learn_jpa_and_hibernate.dto.request;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String welcomeUser(@RequestBody request req)
    {
         return "Welcome " + req.getName();
    }
}
