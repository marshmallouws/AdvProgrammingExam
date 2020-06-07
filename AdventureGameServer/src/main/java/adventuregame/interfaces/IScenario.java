/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.interfaces;

import data.actor.GameCharacter;
import data.actor.Monster;
import java.util.List;

/**
 *
 * @author Annika
 */
public interface IScenario {
    // Scenario is the whole game
    public List<GameCharacter> getCharacters();
    public Event findNextEvent();
}
