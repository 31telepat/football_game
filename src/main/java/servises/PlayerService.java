package servises;

import dao.PlayerDao;
import models.Player;

public class PlayerService {

    private PlayerDao playersDao = new PlayerDao();

    public PlayerService() {
    }

    public Player findUser(int id) {
        return playersDao.findById(id);
    }

    public void saveUser(Player player) {
        playersDao.save(player);
    }

    public void deleteUser(Player player) {
        playersDao.delete(player);
    }

    public void updateUser(Player player) {
        playersDao.update(player);
    }
}
