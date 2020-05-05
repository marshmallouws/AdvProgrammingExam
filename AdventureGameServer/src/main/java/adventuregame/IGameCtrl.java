/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

/**
 *
 * @author Annika
 */
public interface IGameCtrl {
    public void findPlayers(int noOfPlayers);
    public void startGame();
    public void playGame();
    public void playersTurn(IPlayerCtrl player);
}
