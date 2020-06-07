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
public abstract class Defense extends Item {
    private final int durability;
    
    public Defense(String name, int value, int durability) {
        super(name, value);
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }
}
