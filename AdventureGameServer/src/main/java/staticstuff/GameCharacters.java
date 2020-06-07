/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticstuff;

import java.util.ArrayList;
import java.util.List;
import data.actor.GameCharacter;
import data.actor.Race;
import data.actor.Ability;

/**
 *
 * @author Annika
 */
public class GameCharacters {
    public static List<GameCharacter> characters = new ArrayList<>();
    static {
        Ability a = new Ability("Nothing", "Beats Nothing");
        
        Race wizard = new Race("Wizard", 110, a);
        Race human = new Race("Human", 75, null);
        Race dwarf = new Race("Dwarf", 130, null);
        Race elf = new Race("Elf", 105, null);
        Race witcher = new Race("Witcher", 115, null);
        
        GameCharacter gandalf = new GameCharacter(wizard, "Gandalf");
        GameCharacter gimli = new GameCharacter(dwarf, "Gimli the Great");
        GameCharacter legolas = new GameCharacter(elf, "Legolas");
        GameCharacter gerald = new GameCharacter(witcher, "Gerald of Rivia");
        GameCharacter rick = new GameCharacter(human, "Rick Sanchez");
        
        characters.add(gandalf);
        characters.add(gimli);
        characters.add(legolas);
        characters.add(gerald);
        characters.add(rick);
        
    }
}
