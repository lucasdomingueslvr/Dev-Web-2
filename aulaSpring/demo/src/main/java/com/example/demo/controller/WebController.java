package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController{
    @GetMaping("/")
    public String home(Model model){
        model.addAttribute("message", "teste");
        return "home";
    }
}