package com.miu.cs.cs425.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Welcome to eLibrary");
        model.addAttribute("message", "Your digital library awaits!");
        return "home";
    }
}
