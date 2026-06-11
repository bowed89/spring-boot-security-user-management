package com.spring_mvc_security.managment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/")
    public String showHome() {

        return "home";
    }
    // add request mapping for Leaders
    @GetMapping("/leaders")
    public String showLeaders() {

        return "leaders";
    }

    // add request mapping for /systems (admins)
    @GetMapping("/systems")
    public String showSystems() {
        return "systems";
    }


    }
