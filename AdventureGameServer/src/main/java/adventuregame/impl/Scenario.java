/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.impl;

import data.event.MonsterEvent;
import data.event.Event;
import adventuregame.interfaces.IScenario;
import data.actor.GameCharacter;
import data.actor.Merchant;
import data.actor.Monster;
import data.event.MerchantEvent;
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
    private final List<Merchant> merchantsMet;
    private static final EventFactory EVENT_FACTORY = new EventFactory();
    private static final Random RND = new Random();
    
    public Scenario(String goal, List<GameCharacter> characters) {
        this.goal = goal;
        this.characters = characters;
        this.events = new ArrayList<>();
        this.monstersMet = new ArrayList<>();
        this.merchantsMet = new ArrayList<>();
    }
    
    @Override
    public List<GameCharacter> getCharacters() {
        return characters;
    }
    
    private Monster createMonster() {
        Monster monster = EVENT_FACTORY.createMonster(100, monstersMet);
        monstersMet.add(monster);
        return monster;
    }
    
    private MonsterEvent createMonsterEvent() {
        Monster m = createMonster();
        List<String> intros = AdventureText.getMonsterIntros();
        String intro = intros.get(RND.nextInt(intros.size()));
        // TODO: Find outros
        return new MonsterEvent(intro, "missing outro", m);
    }
    
    private MerchantEvent createMerchantEvent() {
        Merchant m = EVENT_FACTORY.createMerchant();        
        List<String> intros = AdventureText.getMerchantIntros();
        String intro = intros.get(RND.nextInt(intros.size()));
        return new MerchantEvent(intro, "missing outro", m);
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
        } else if (e instanceof MerchantEvent) {
            merchantsMet.add(((MerchantEvent)e).getMerchant());
        }
        return e;
    }
    
    private void createEvents(int numberOfEvents) {
        for(int i = 0; i < numberOfEvents; i++) {
            if(i % 2 == 0) {
                events.add(createMonsterEvent());
            } else {
                events.add(createMerchantEvent());
            }
        }
        Collections.shuffle(events);
    }
}
