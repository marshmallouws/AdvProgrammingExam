/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.impl;

import adventuregame.interfaces.IPlayerCtrl;
import data.actor.Player;
import data.collectible.Item;
import java.util.List;
import server.IClientHandler;

/**
 *
 * @author Annika
 */
public class PlayerCtrl implements IPlayerCtrl {
    private final Player player;
    private final IClientHandler clientHandler;
    
    public PlayerCtrl(Player player, IClientHandler clientHandler) {
        this.player = player;
        this.clientHandler = clientHandler;
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Item> getItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void writeToPlayer(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getIntChoice(List<String> choices) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
