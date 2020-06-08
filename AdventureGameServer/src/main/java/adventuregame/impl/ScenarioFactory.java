/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.impl;

import adventuregame.impl.Scenario;
import data.actor.GameCharacter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import staticstuff.GameCharacters;
import text.AdventureText;

/**
 * The purpose of this class is to create a variable scenario
 * @author Annika
 */
public class ScenarioFactory {
    private static final Random RND = new Random();
    private static ScenarioFactory instance;
    
    private ScenarioFactory() {
    }
    
    public static ScenarioFactory getInstance() {
        if(instance == null) {
            instance = new ScenarioFactory();
        } 
        return instance;
    }
    
    private List<GameCharacter> findCharacters(int noOfPlayers) {
        List<GameCharacter> charactersInGame = new ArrayList<>();
        List<GameCharacter> characters = GameCharacters.characters;
        

        // copy stories
        List<String> backstories = new ArrayList<>();
        backstories.addAll(AdventureText.getBackstories());
        
        
        for(int i = 0; i < noOfPlayers; i++) {
            GameCharacter gc = characters.get(RND.nextInt(characters.size()));
            characters.remove(gc);
            String b = "";
            
            if(i == 0) {
                // no need to copy since I only need one
                List<String> h = AdventureText.getHeroBackstory();
                b = h.get(RND.nextInt(h.size()));
            } else {
                b = backstories.get(RND.nextInt(backstories.size()));
                backstories.remove(b);
            }
            
            gc.setBackstory(b);
            charactersInGame.add(gc);
        }
        return charactersInGame;
    }
    
    private String findGoal() {
        List<String> goals = AdventureText.getGoals();
        return goals.get(RND.nextInt(goals.size()));
    }
    
    public Scenario createScenario(int numberOfPlayers) {
        String goal = findGoal();
        List<GameCharacter> characters = findCharacters(numberOfPlayers);
        
        return new Scenario(goal, characters);
    }
}
