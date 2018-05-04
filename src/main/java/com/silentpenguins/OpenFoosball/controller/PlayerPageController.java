package com.silentpenguins.OpenFoosball.controller;

import com.silentpenguins.OpenFoosball.pojo.Player;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class PlayerPageController {

    @Value("${welcome.message:test}")
    private String message = "Hello World";


    @RequestMapping("/playerpage")
    public String showPlayerPage(Map<String, Object> model) {
        Player logged_player = new Player();
        model.put("message", this.message);
        model.put("logged_player", logged_player);
        return "playerpage";
    }

}

