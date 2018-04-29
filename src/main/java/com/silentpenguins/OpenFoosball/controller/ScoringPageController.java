package com.silentpenguins.OpenFoosball.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScoringPageController {
    @RequestMapping("/scoring")
    public String showScoring() {
        return "scoring";
    }

}

