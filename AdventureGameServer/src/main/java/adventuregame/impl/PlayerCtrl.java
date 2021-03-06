/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.impl;

import adventuregame.interfaces.IPlayerCtrl;
import data.actor.Player;
import data.collectible.Item;
import java.io.IOException;
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
    public String getCharacterName() {
        return player.getCharacter().getName();
    }

    @Override
    public List<Item> getItems() {
        return player.getItems();
    }

    @Override
    public void writeToPlayer(String message, boolean pressEnter) {
        clientHandler.write(message, pressEnter);
    }

    @Override
    public int getIntChoice(int min, int max, String choices) {
        while (true) {
            try {
                return clientHandler.getIntChoice(min, max, choices);
            } catch (IOException e) {
                // Keep looping, not good, but keep looping
            }
        }
    }

    /**
     * getPlayer returns the player managed by the controller.
     *
     * @return the player
     */
    @Override
    public Player getPlayer() {
        return player;
    }

    @Override
    public boolean pressEnter(String message) {
        while (true) {
            try {
                return clientHandler.pressEnter(message);
            } catch (IOException e) {
                // Keep looping
            }
        }
    }
}
