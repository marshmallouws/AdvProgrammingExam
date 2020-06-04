/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.impl;

import adventuregame.interfaces.IMonsterEvent;
import data.actor.Monster;
import data.actor.MonsterType;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import text.AdventureText;

/**
 *
 * @author Annika
 */
public class MonsterEvent implements IMonsterEvent {
    private static final Random RND = new Random();
    private final int playersStrength;
    
    public MonsterEvent(int playersStrength) {
        this.playersStrength = playersStrength;
    }

    @Override
    public String startEvent() {
        List<String> intros = AdventureText.getMonsterIntros();
        String intro = intros.get(RND.nextInt(intros.size()));
        return intro;
    }

    @Override
    public Monster createMonster() {
        // TODO: Use playersStrength and monstersMet!
        List<MonsterType> all = Arrays.asList(MonsterType.values());
        int i = RND.nextInt(all.size());
        MonsterType type = all.get(i);
        int noOfHeads = RND.nextInt(5)+1;
        int noOfEyes = RND.nextInt(10)+1;
        int height = RND.nextInt(8)+2; //2-10
        int strength = RND.nextInt(50)+50 + height*height; // 50-100 + height^2
        int speed = RND.nextInt(100)+1;
        
        return new Monster(noOfEyes, strength, speed, type, noOfHeads, height);
    }

    @Override
    public String getChoices(Monster monster, int slowestCharacter) {
        if(monster.getSpeed() >= slowestCharacter) {
            return "You cannot outrun the monster";
        } else {
            return "You can either run or fight. Choose wisely.";
        }
    }
    
    @Override
    public void fight() {
        
    }
    
    @Override
    public void run() {
        
    }

    @Override
    public String finishEvent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
