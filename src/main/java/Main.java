import models.Player;
import servises.PlayerService;

public class Main {
    public static void main(String[] args) {

        PlayerService playerService = new PlayerService();
        Player player = new Player("Fedor", 23);
        playerService.saveUser(player);

    }
}
