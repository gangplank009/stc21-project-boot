package com.stc21.springboot.auction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WelcomeController {

    @GetMapping("/")
    public String showWelcomePage(Model model) {
        model.addAttribute("msg", "Hello from Spring Boot 2!!!");
        return "welcome";
    }
}
