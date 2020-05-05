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
    private final Character character;
    private final String name;
    
    public Player(Character character, String name) {
        this.character = character;
        this.name = name;
    }
}
