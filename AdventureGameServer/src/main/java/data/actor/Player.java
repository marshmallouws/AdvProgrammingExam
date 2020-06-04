/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.actor;

/**
 *
 * @author Annika
 */
public class Player {
    private final GameCharacter gameCharacter;
    
    public Player(GameCharacter gameCharacter) {
        this.gameCharacter = gameCharacter;
    }
    
    public GameCharacter getCharacter() {
        return gameCharacter;
    }
}
