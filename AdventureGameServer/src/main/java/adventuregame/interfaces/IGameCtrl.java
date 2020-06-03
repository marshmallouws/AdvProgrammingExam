package adventuregame.interfaces;

import adventuregame.impl.PlayerCtrl;
import java.util.List;

/**
 * @author Annika
 */
public interface IGameCtrl {
    public void startGame();
    public void playGame();
    public void writeToAll(String msg);
    public void endGame();
}
