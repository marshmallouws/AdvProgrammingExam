package adventuregame.impl;

import adventuregame.interfaces.IGameCtrl;
import adventuregame.interfaces.IPlayerCtrl;
import java.util.List;

/**
 * @author Annika
 */
public class GameCtrl implements IGameCtrl {
    private final List<IPlayerCtrl> players;
    
    public GameCtrl(List<IPlayerCtrl> players) {
        this.players = players;
    }

    @Override
    public void startGame() {
        writeToAll("You are walking down a lonely road.");
    }

    @Override
    public void playGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void writeToAll(String msg) {
        for(IPlayerCtrl player: players) {
            player.writeToPlayer(msg);
        }
    }
    
    @Override
    public void endGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
