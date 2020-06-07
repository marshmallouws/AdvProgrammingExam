/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.interfaces;

import data.actor.Player;
import data.collectible.Item;
import java.util.List;

/**
 *
 * @author Annika
 */
public interface IPlayerCtrl {
    public String getCharacterName();
    public List<Item> getItems();
    public void writeToPlayer(String message, boolean pressEnter);
    public int getIntChoice(int min, int max, String choices);
    public Player getPlayer();
    public boolean pressEnter(String message);
}
