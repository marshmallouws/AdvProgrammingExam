/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.impl;

import data.actor.Merchant;
import data.actor.Monster;
import data.collectible.Armor;
import data.collectible.Item;
import data.collectible.Sword;
import enums.MonsterType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Annika
 */
public class EventFactory {
    private static final Random RND = new Random();
    
    public Merchant createMerchant() {
        // TODO: make dynamic
        // Item, price
        Map<Integer, Item> items = new HashMap<>();
        items.put(1, new Sword("Excalibur2000", 700, 10));
        items.put(2, new Sword("Excalibur", 450, 5));
        items.put(3, new Armor("Armor", 550, 10));
        
        Merchant m = new Merchant(items, "Hansi Hinterseer");
        return m;
    }
    
    public Monster createMonster(int playersStrength, List<Monster> monstersMet) {
        // TODO: Use playersStrength and monstersMet!
        List<MonsterType> all = Arrays.asList(MonsterType.values());
        int i = RND.nextInt(all.size());
        MonsterType type = all.get(i);
        int noOfHeads = RND.nextInt(5)+1;
        int noOfEyes = RND.nextInt(5)+1; // Number of eyes on each head
        int height = RND.nextInt(8)+2; //2-10
        int strength = RND.nextInt(50) + height*height; // 50-100 + height^2
        int speed = RND.nextInt(100)+1;
        
        return new Monster(noOfEyes, strength, speed, type, noOfHeads, height);
    }
}
