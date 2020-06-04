/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.impl;

import adventuregame.interfaces.IEvent;
import adventuregame.interfaces.IScenario;
import data.actor.GameCharacter;
import java.util.List;

/**
 *
 * @author Annika
 */
public class Scenario implements IScenario {
    private final String goal;
    private final List<GameCharacter> characters;
    private final List<IEvent> events;
    
    public Scenario(String goal, List<GameCharacter> characters, List<IEvent> events) {
        this.goal = goal;
        this.characters = characters;
        this.events = events;
    }

    @Override
    public void handleEvent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
