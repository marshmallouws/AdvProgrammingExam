/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.actor;

import data.collectible.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Annika
 */
public class Player {
    private final GameCharacter gameCharacter;
    private int maxNoOfItems;
    private List<Item> items;
    private int health = 100;
    private int speed = 20;
    private int gold = 1000;
    
    /**
     * Create player with given character and inventory size.
     * The player will not have any items on it.
     * @param gameCharacter the player's character.
     * @param maxNoOfItems the inventory size.
     */
    public Player(GameCharacter gameCharacter, int maxNoOfItems) {
        this(gameCharacter, maxNoOfItems, new ArrayList<Item>());
    }
    
    /**
     * Create a player with given character, inventory size and list of items.
     * @param gameCharacter the player's character
     * @param maxNoOfItems the inventory size
     * @param items the player's list of items.
     */
    public Player(GameCharacter gameCharacter, int maxNoOfItems, List<Item> items) {
        this.gameCharacter = gameCharacter;
        this.maxNoOfItems = maxNoOfItems;
        this.items = items;
    }
    
    public GameCharacter getCharacter() {
        return gameCharacter;
    }
    
    public int attack() {
        // base damage of 1 is without a weapon. FIST FIGHT
        int damage = 1;
        // TODO: should add weapon damage.
        
        int s = gameCharacter.getRace().getStrength();
        // multiple the base damage with strength
        damage *= s / 10;
        // small bonus for being the hero ;)
        if (gameCharacter.isHero()) {
            damage += 5;
        }
        return damage;
    }
    
    public int getMaxNoOfItems() {
        return maxNoOfItems;
    }

    public List<Item> getItems() {
        return items;
    }

    public int getHealth() {
        return health;
    }

    public void loseHealth(int healthLost) {
        this.health -= healthLost;
    }
    
    /**
     * isDead checks whether the player is dead or not.
     * 
     * The method is a convenience as the same can be achieved by checking if
     * the health of the player is less than 1.
     * @return true if the player is dead otherwise false
     */
    public boolean isDead() {
        return health < 1;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public int getGold() {
        return gold;
    }
    
    public void pay(int price) {
        gold -= price;
    }
    
    public void addItem(Item item) {
        if(items.size() < maxNoOfItems) {
            items.add(item);
        }
    }
}
