/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.impl;

import adventuregame.interfaces.IMonsterFactory;
import data.actor.Monster;
import enums.MonsterType;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Annika
 */
public class MonsterFactory implements IMonsterFactory {
    private static final Random RND = new Random();

    @Override
    public int findNumberOfHeads() {
        return 0;
    }

    @Override
    public int findNumberOfEyes(int noOfHeads) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int findStrength(int playersStrength) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int findSpeed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int findHeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Monster createMonster(int playersStrength, List<Monster> monstersMet) {
        // TODO: Use playersStrength and monstersMet!
        List<MonsterType> all = Arrays.asList(MonsterType.values());
        int i = RND.nextInt(all.size());
        MonsterType type = all.get(i);
        int noOfHeads = RND.nextInt(5)+1;
        int noOfEyes = RND.nextInt(10)+1;
        int height = RND.nextInt(8)+2; //2-10
        int strength = RND.nextInt(50) + height*height; // 50-100 + height^2
        int speed = RND.nextInt(100)+1;
        
        return new Monster(noOfEyes, strength, speed, type, noOfHeads, height);
    }
    
}
