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
public class Monster {
    private final int noOfEyes;
    private int health;
    private final MonsterType type;
    private final int noOfHeads;
    private final int height;
    private final int speedInKm;
    
    public Monster(int noOfEyes, int health, MonsterType type, 
            int noOfHeads, int height, int speedInKm) {
        this.noOfEyes = noOfEyes;
        this.health = health;
        this.type = type;
        this.noOfHeads = noOfHeads;
        this.height = height;
        this.speedInKm = speedInKm;
    }
}
