package adventuregame.interfaces;

import data.actor.Player;
import java.util.List;

/**
 * @author Annika
 */
public interface IGameCtrl {
    public void createPlayers(List<Player> players);
    public void startGame();
    public void playGame();
    public void playersTurn(IPlayerCtrl player);
    public void writeToAll(String msg);
    public void endGame();
}
