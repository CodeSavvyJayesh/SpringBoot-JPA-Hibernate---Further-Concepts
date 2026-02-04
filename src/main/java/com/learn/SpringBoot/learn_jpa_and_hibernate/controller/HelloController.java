package com.learn.SpringBoot.learn_jpa_and_hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
      @GetMapping("say-hello")
      public String hello(){
          return "Hey there I am jayesh ";


      }
}
