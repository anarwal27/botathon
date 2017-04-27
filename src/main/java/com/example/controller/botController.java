package com.example.controller;

import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by anarwal on 4/27/17.
 */

@RestController
public class botController {


    @RequestMapping("/")
    public String botMethod(){
        return "Hello Hackers";
    }
}
