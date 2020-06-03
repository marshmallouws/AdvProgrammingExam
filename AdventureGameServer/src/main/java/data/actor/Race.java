package data.actor;

import java.util.List;

/**
 *
 * @author Annika
 */
public class Race {
    private final String name;
    private final int strength;
    private Ability ability;
    
    public Race(String raceName, int strength, Ability ability) {
        this.name = raceName;
        this.strength = strength;
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public Ability getAbility() {
        return ability;
    }
    
    
}
