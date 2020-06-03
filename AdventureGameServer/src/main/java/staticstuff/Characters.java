/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticstuff;

import java.util.ArrayList;
import java.util.List;
import data.actor.Character;
import data.actor.Race;
import data.actor.Ability;

/**
 *
 * @author Annika
 */
public class Characters {
    public static List<Character> characters = new ArrayList<>();
    static {
        Ability a = new Ability("Nothing", "Beats Nothing");
        
        Race wizard = new Race("Wizard", 110, a);
        Race human = new Race("Human", 75, null);
        Race dwarf = new Race("Dwarf", 130, null);
        Race elf = new Race("Elf", 105, null);
        Race witcher = new Race("Witcher", 115, null);
        
        Character gandalf = new Character(wizard, "Gandalf", 10, null);
        Character gimli = new Character(dwarf, "Gimli", 10, null);
        Character legolas = new Character(elf, "Legolas", 10, null);
        Character gerald = new Character(witcher, "Gerald of Rivia", 10, null);
        Character rick = new Character(human, "Rick Sanchez", 10, null);
        
        characters.add(gandalf);
        characters.add(gimli);
        characters.add(legolas);
        characters.add(gerald);
        characters.add(rick);
        
    }
}
