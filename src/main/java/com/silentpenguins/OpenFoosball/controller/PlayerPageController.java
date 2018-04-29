package com.silentpenguins.OpenFoosball.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlayerPageController {


    @RequestMapping("/playerpage")
    public String showLogin() {
        return "playerpage";
    }

}

