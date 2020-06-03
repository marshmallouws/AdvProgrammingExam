package data.actor;

import data.collectible.Item;
import java.util.List;

/**
 * @author Annika
 */
public class Character {
    private final Race race;
    private final String name;
    private int maxNoOfItems;
    private List<Item> items;

    public Character(Race race, String name, int maxNoOfItems, List<Item> items) {
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
}
