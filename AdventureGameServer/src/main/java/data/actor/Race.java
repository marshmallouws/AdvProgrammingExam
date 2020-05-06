/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.actor;

import java.util.List;

/**
 *
 * @author Annika
 */
public abstract class Race {
    private final String raceName;
    private final int strenght;
    private List<Ability> abilities;
    
    public Race(String raceName, int strength, List<Ability> abilities) {
        this.raceName = raceName;
        this.strenght = strength;
        this.abilities = abilities;
    }
}
