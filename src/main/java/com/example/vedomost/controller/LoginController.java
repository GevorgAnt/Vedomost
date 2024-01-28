package com.example.vedomost.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping(value = "/login", produces = "text/css")
    public String login() {
        return "login";
    }
}