package com.silentpenguins.OpenFoosball.controller;

import com.silentpenguins.OpenFoosball.pojo.Player;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.Objects;

@Controller
public class PlayerPageController {

    @Value("${welcome.message:test}")
    private String message = "Hello World";


    @RequestMapping("/playerpage")
    public String showPlayerPage(Map<String, Object> model, @RequestParam(value="player", required=false) String player_param) {
        Player logged_player = new Player();
        model.put("message", this.message);

        Player requested_player = new Player();
        if (player_param != null){
            requested_player.setFirstName("Mateusz");
            requested_player.setLastName("Wasiak");
            requested_player.setWins(3);
            requested_player.setMatches(4);
            requested_player.setUserName(player_param);
            requested_player.setPoints(0);
            requested_player.setDescription("ELOELOELOELO_TEST_ELO");
            model.put("player", requested_player);
            //TODO zmodyfikować, żeby to było setowane z bazy w zależności od username :)
        }
        else
            requested_player = logged_player;

        model.put("player", requested_player);
        return "playerpage";
    }

}

