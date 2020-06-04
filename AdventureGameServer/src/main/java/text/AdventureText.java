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
    // Intro
    private static final ArrayList<String> BACKSTORY = new ArrayList<String>() { 
            { 
                add("You are wandering lonely in the Silent Woods, purposeless and with no home to turn to."
                        + "An outcast in your own village. A creepy stranger on the road. Thats when you hear about the hero of Duergar. "
                        + "Curiosly, you head there.");
                
                add("You are considered the greatest hero in the small village of "
                        + "Duergar. Will you tell the people that you did not\n"
                        + "slay the dragon and let them hate you for eternity? "
                        + "Or will you live a lie? Before you can even decide, you are set on an extremely dangerous quest."); 
                
                add("Your days go by with fishing and your nights go by with reading a book. Why would anyone ever want more? "
                        + "That is the simple life and that is how you love it. One day, two mysterious strangers turn up on your doorstep. "
                        + "They need water so you reluctantly let them in. ");
            }
        };
    
    private static final ArrayList<String> OBJECTIVES = new ArrayList<String>() {
        {
            add("%s has been sent to kill a mystical monster that lives in the mountains far east. "
                        + "No man nor woman has ever seen it and lived to tell the tale. And that is where the adventure start for the %i strangers.");
            add("%s has been ordered by the king to save the princess whom mysterically dissapeared "
                        + "in the dead of night. And that is where the adventure start for the %i strangers.");
        }
    };
    
    public static List<String> getBackstories() {
        return BACKSTORY;
    }
    
    public static List<String> getObjectives() {
        return OBJECTIVES;
    }
    
    // Character
    private static final String writeCharacterName = "Welcome %s";
    
    public static String getWriteCharacterName(String name) {
        return String.format(writeCharacterName, name);
    }
    
    // Monster events
    private static final ArrayList<String> monsterEventIntro = new ArrayList<String>() {
        {
            add("You are pushing your way through the bushes of the dark and lonely forest. Everyone is tired but quickly you wake up.");
            add("You are happily walking on a hill filled with wonderful wild flowser. When you get to the top, you see something approaching you.");
            add("You are walking into a ghost town at twilight, wondering where all the people are. Around the corner you see a silhouette.");
        }
    };
    
    public static List<String> getMonsterIntros() {
        return monsterEventIntro;
    }
    
    // Merchant Events
    private static final ArrayList<String> merchantEventIntro = new ArrayList<String>() {
        {
            add("You are walking down a a small road in the forest when you encounter a mysterious stranger.");
            add("After spending the night in a small village, you take a look around when you find a little shop with a curios merchant.");
            add("After aimlessly walking around for days, you finally meet another person.");
        }
    };
    
    public static List<String> getMerchantIntros() {
        return merchantEventIntro;
    }
    
}
