/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import data.actor.Player;
import java.util.List;

/**
 *
 * @author Annika
 */
public interface IGameCtrl {
    public void createPlayers(List<Player> players);
    public void startGame();
    public void playGame();
    public void playersTurn(IPlayerCtrl player);
}
