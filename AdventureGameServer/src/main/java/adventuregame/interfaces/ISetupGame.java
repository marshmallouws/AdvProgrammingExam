/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.interfaces;

import java.util.List;

/**
 *
 * @author Annika
 */
public interface ISetupGame {
    // public int getNumberOfPlayers(int numberOfPlayers); (should maybe be constructor)
    public List<Character> createCharacters(int numberOfPlayers);
    public String sendCharacterData(IPlayerCtrl player);
}
