package data.actor;

import data.collectible.Item;
import java.util.List;

/**
 * @author Annika
 */
public class Character extends Race {    
    private final String name;
    private int maxNoOfItems;
    private List<Item> items;

    public Character(String name, int maxNoOfItems, List<Item> items, 
            String raceName, int strength, List<Ability> abilities) {
        
        super(raceName, strength, abilities);
        this.name = name;
        this.maxNoOfItems = maxNoOfItems;
        this.items = items;
    }
}
