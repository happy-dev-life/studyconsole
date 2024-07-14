package com.eactive.studyconsole.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/main")
    public String main(Model model, Principal principal) {
        model.addAttribute("username", principal.getName());
        return "main";
    }
}

