package adventuregame.impl;

import adventuregame.interfaces.IGameCtrl;
import adventuregame.interfaces.IPlayerCtrl;
import data.actor.Monster;
import java.util.List;
import java.util.Random;
import text.AdventureText;

/**
 * @author Annika
 */
public class GameCtrl implements IGameCtrl {
    private final List<IPlayerCtrl> players;
    private int noOfMonsters; // The number of monsters that the group has met
    private int noOfHelpers; // Number of helpers the group has met
    private Random rnd = new Random();
    
    public GameCtrl(List<IPlayerCtrl> players) {
        this.players = players;
    }

    @Override
    public void startGame() {
        AdventureText t = new AdventureText();
        List<String> backstories = t.getBackstories();
        for(IPlayerCtrl p: players) {
            String bs = backstories.get(rnd.nextInt(backstories.size()));
            backstories.remove(bs);
            p.writeToPlayer(bs);
        }
    }

    @Override
    public void playGame() {
        //Event e = new Event();
        //Monster m = e.createMonster(50, null);
        //handleMonsterEvent(m, 50);
    }
    
    @Override
    public void writeToAll(String msg) {
        if(players == null) {
            System.out.println(msg);
            return;
        }
        for(IPlayerCtrl player: players) {
            player.writeToPlayer(msg);
        }
        System.out.println(msg);
    }
    
    public void handleMonsterEvent(Monster monster, int slowest) {        
        writeToAll("You are walking in the Silent Woods when suddenly you see something moving in the trees. "
                        + "When taking a closer look, you see a " + monster.getType().toString().toLowerCase() + ". " 
                        + monster.getHeight() + " " + "metres tall, with " + monster.getNoOfEyes()
                        + " eyes staring directly at you."
                );
        if(monster.getSpeed() > slowest) {
            writeToAll("You have no choice but to fight, the monster is too fast to outrun.");
        } else {
            writeToAll("The beast is big and strong, but if you are quick on your feet, "
                    + "you might be able to outrun it");
            // Send a vote
        }
    }
    
    @Override
    public void endGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
