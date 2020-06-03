/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Annika
 */
public class AdventureText {
    private final ArrayList<String> backstory = new ArrayList<String>() { 
            { 
                add("You are wandering lonely in the Silent Woods, purposeless and with no home to turn to."
                        + "An outcast in your own village. A creepy stranger on the road. Thats when you hear about the hero of Duergar. "
                        + "Curiosly, you head there.");
                
                add("You are considered the greatest hero in the small village of "
                        + "Duergar. Will you tell the people that you did not slay the dragon and let them hate you for eternity? "
                        + "Or will you live a lie? Before you can even decide, you are set on an extremely dangerous quest."); 
                
                add("Your days go by with fishing and your nights go by with reading a book. Why would anyone ever want more? "
                        + "That is the simple life and that is how you love it. One day, two mysterious strangers turn up on your doorstep. "
                        + "They need water so you reluctantly let them in. ");
            }
        };
    
    private final ArrayList<String> objectives = new ArrayList<String>() {
        {
            add("%s has been sent to kill a mystical monster that lives in the mountains far east. "
                        + "No man nor woman has ever seen it and lived to tell the tale. And that is where the adventure start for the %i strangers.");
            add("%s has been ordered by the king to save the princess whom mysterically dissapeared "
                        + "in the dead of night. And that is where the adventure start for the %i strangers.");
        }
    };
    
    private final ArrayList<String> events = new ArrayList<String>() {
        {
            add("");
        }
    };
    
    public ArrayList<String> getBackstory() {
        return backstory;
    }
    
    // Character
    private final String writeCharacterName = "Welcome %s";
    
    public String getWriteCharacterName(String name) {
        return String.format(writeCharacterName, name);
    }
    
    // Events
    
    
}
