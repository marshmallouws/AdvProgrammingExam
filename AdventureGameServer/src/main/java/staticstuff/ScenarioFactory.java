/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticstuff;

import adventuregame.impl.Scenario;
import adventuregame.interfaces.IEvent;
import data.actor.GameCharacter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import text.AdventureText;

/**
 * The purpose of this class is to create a variable scenario
 * @author Annika
 */
public class ScenarioFactory {
    private final int noOfPlayers;
    private static final Random RND = new Random();
    
    public ScenarioFactory(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }
    
    private List<GameCharacter> findCharacters() {
        List<GameCharacter> charactersInGame = new ArrayList<>();
        List<GameCharacter> characters = GameCharacters.characters;
        List<String> backstories = AdventureText.getBackstories();
        
        for(int i = 0; i < noOfPlayers; i++) {
            GameCharacter gc = characters.get(RND.nextInt(characters.size()));
            characters.remove(gc);
            
            String b = backstories.get(RND.nextInt(backstories.size()));
            backstories.remove(b);
            gc.setBackstory(b);
            charactersInGame.add(gc);
        }
        return charactersInGame;
    }
    
    private String findGoal() {
        List<String> goals = AdventureText.getObjectives();
        return goals.get(RND.nextInt(goals.size()));
    }
    
    private void findhero() {
        
    }
    
    private List<IEvent> createEvents() {
        return null;
    }
    
    
    public Scenario createScenario() {
        String goal = findGoal();
        List<GameCharacter> characters = findCharacters();
        
        return new Scenario(goal, characters, null);
    }
}
