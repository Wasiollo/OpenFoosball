package com.silentpenguins.OpenFoosball.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewMatchController {

    @RequestMapping("/new_match")
    public String showLogin() {
        return "new_match";
    }
}
