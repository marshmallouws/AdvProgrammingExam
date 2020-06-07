/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.event;

import data.event.Event;
import data.actor.Monster;
import text.AdventureText;

/**
 *
 * @author Annika
 */
public class MonsterEvent extends Event {

    private final Monster monster;
    private final String description;

    public MonsterEvent(String intro, String outro, Monster monster) {
        super(intro, outro);
        this.monster = monster;
        this.description = AdventureText.describeMonster(monster);
    }
    
    public Monster getMonster() {
        return monster;
    }
    
    public String getDescription() {
        return description;
    }
}
