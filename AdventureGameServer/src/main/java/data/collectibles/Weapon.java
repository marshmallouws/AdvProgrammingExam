/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.collectibles;

/**
 *
 * @author Annika
 */
public abstract class Weapon {
    private final int strength;
    private final String name;
    private int ownDamage;
    
    public Weapon(int strength, String name, int ownDamage) {
        this.strength = strength;
        this.name = name;
        this.ownDamage = ownDamage;
    }
}
