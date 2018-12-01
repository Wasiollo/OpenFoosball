package com.silentpenguins.OpenFoosball.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RankingController {

    @RequestMapping("/ranking")
    public String showRanking() {
        return "ranking";
    }
}
