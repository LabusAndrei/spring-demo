package com.example.springdemo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Overview {

    @GetMapping(value = "/Overview")
    public String sidebar(Model model){

        return "Overview";
    }

}
