package controller;

import models.Player;
import servises.PlayerService;

public class RunApp {

    public static void run(){





        PlayerService playerService = new PlayerService();
        Player player = new Player("Dorian", 28);
        playerService.saveUser(player);

    }
}
