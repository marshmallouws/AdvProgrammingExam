package adventuregame.impl;

import adventuregame.interfaces.IGameCtrl;
import adventuregame.interfaces.IPlayerCtrl;
import data.actor.Player;
import java.util.List;

/**
 * @author Annika
 */
public class GameCtrl implements IGameCtrl {
    private List<PlayerCtrl> players;

    @Override
    public void createPlayers(List<Player> players) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void startGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void playGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void playersTurn(IPlayerCtrl player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void writeToAll(String msg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void endGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
