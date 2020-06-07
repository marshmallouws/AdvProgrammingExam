package adventuregame.interfaces;

import adventuregame.impl.PlayerCtrl;
import data.actor.Monster;
import data.event.Event;
import java.util.List;

/**
 * @author Annika
 */
public interface IGameCtrl {
    public void playGame();
    public void writeToAll(String msg, boolean pressEnter);
    public void endGame();
    public void run();
    public boolean canRun(Monster monster);
    public boolean handleEvent(Event event);
    public boolean voteToRun();
}
