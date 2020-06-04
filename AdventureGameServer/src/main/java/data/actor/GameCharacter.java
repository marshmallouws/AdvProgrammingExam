package data.actor;

import data.collectible.Item;
import java.util.List;

/**
 * @author Annika
 */
public class GameCharacter {
    private final Race race;
    private final String name;
    private int maxNoOfItems;
    private List<Item> items;
    private String backstory;
    private boolean hero;

    public GameCharacter(Race race, String name, int maxNoOfItems, List<Item> items) {
        this.race = race;
        this.name = name;
        this.maxNoOfItems = maxNoOfItems;
        this.items = items;
    }

    public Race getRace() {
        return race;
    }

    public String getName() {
        return name;
    }

    public int getMaxNoOfItems() {
        return maxNoOfItems;
    }

    public List<Item> getItems() {
        return items;
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
