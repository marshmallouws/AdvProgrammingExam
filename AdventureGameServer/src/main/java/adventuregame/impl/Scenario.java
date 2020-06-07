/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.impl;

import adventuregame.interfaces.Event;
import adventuregame.interfaces.IScenario;
import data.actor.GameCharacter;
import data.actor.Helper;
import data.actor.Monster;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import text.AdventureText;

/**
 * Scenario is meant to have more things. Maybe the players can choose a scenario
 * in the long run.
 * @author Annika
 */
public class Scenario implements IScenario {
    private final String goal;
    private final List<GameCharacter> characters;
    private final List<Event> events;
    private final List<Monster> monstersMet;
    private final List<Helper> helpersMet;
    private static final MonsterFactory MONSTER_FACTORY = new MonsterFactory();
    private static final Random RND = new Random();
    
    public Scenario(String goal, List<GameCharacter> characters) {
        this.goal = goal;
        this.characters = characters;
        this.events = new ArrayList<>();
        this.monstersMet = new ArrayList<>();
        this.helpersMet = new ArrayList<>();
    }
    
    @Override
    public List<GameCharacter> getCharacters() {
        return characters;
    }
    
    private Monster createMonster() {
        Monster monster = MONSTER_FACTORY.createMonster(100, monstersMet);
        monstersMet.add(monster);
        return monster;
    }
    
    private MonsterEvent createMonsterEvent() {
        Monster m = createMonster();
        List<String> intros = AdventureText.getMonsterIntros();
        String intro = intros.get(RND.nextInt(intros.size()));
        // TODO: Find outros
        return new MonsterEvent(m, intro, "");
    }
    
    private void createMerchantEvent() {
        // TODO: Implement
    }
    
    @Override
    public Event findNextEvent() {
        if(events.isEmpty()) {
            createEvents(4);
        }
        Event e = events.get(RND.nextInt(events.size()));
        events.remove(e);
        
        if(e instanceof MonsterEvent) {
            monstersMet.add(((MonsterEvent) e).getMonster());
        }
        
        return e;
    }
    
    private void createEvents(int numberOfEvents) {
        for(int i = 0; i < numberOfEvents; i++) {
            if(i % 2 == 0) {
                events.add(createMonsterEvent());
            } else {
                // TODO: Merchant event
            }
        }
        Collections.shuffle(events);
    }

    /*
    @Override
    public IEvent findEventType(IEvent event) {
        if(event instanceof MonsterEvent) {
            return (MonsterEvent) event;
        } else {
            handleMerchant(event);
        }
    }
    */
}
