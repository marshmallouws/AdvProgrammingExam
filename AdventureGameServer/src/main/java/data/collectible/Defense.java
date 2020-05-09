/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data.collectible;

/**
 *
 * @author Annika
 */
public class Defense extends Item {
    private final int strength;
    
    public Defense(int strength, String name) {
        super(name);
        this.strength = strength;
    }
    
}
