package data.actor;

import java.util.List;

/**
 *
 * @author Annika
 */
public abstract class Race {
    private final String name;
    private final int strength;
    private List<Ability> abilities;
    
    public Race(String raceName, int strength, List<Ability> abilities) {
        this.name = raceName;
        this.strength = strength;
        this.abilities = abilities;
    }
}
