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
public abstract class Armor extends Defense {

    public Armor(String name, int strength) {
        super(strength, name);
    }
}