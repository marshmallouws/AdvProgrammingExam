package data.actor;

import data.collectible.Item;
import java.util.Map;

/**
 * @author Annika
 */
public class Merchant {
    private final Map<Integer, Item> items; // Item, price
    private final String name;
    
    public Merchant(Map<Integer, Item> items, String name) {
        this.items = items;
        this.name = name;
    }

    public Map<Integer, Item> getItems() {
        return items;
    }

    public String getName() {
        return name;
    }
    
    public String itemsToString() {
        String res = "";
        for(Map.Entry<Integer, Item> e: items.entrySet()) {
            res += e.getKey() + ". " + e.getValue().getName() + ", price: " + e.getValue().getValue();
        }
        return res;
    }
}
