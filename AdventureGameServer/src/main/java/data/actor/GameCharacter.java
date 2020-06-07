package data.actor;

import data.collectible.Item;
import java.util.List;

/**
 * @author Annika
 */
public class GameCharacter {
    private final Race race;
    private final String name;
    private String backstory; // Is set dynamically
    private boolean hero; // Is set dynamically

    public GameCharacter(Race race, String name) {
        this.race = race;
        this.name = name;
    }

    public Race getRace() {
        return race;
    }

    public String getName() {
        return name;
    }
    
    public String getBackstory() {
        return backstory;
    }
    
    public void setBackstory(String backstory) {
        this.backstory = backstory;
    }
    
    public boolean isHero() {
        return hero;
    }
    
    public void setIsHero(boolean hero) {
        this.hero = hero;
    }
}
