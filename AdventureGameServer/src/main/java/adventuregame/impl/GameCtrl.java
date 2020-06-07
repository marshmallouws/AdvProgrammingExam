package adventuregame.impl;

import adventuregame.interfaces.Event;
import adventuregame.interfaces.IGameCtrl;
import adventuregame.interfaces.IPlayerCtrl;
import data.actor.GameCharacter;
import data.actor.Helper;
import data.actor.Monster;
import data.actor.Player;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import server.IClientHandler;
import staticstuff.ScenarioFactory;
import text.AdventureText;

/**
 * @author Annika
 */
public class GameCtrl implements IGameCtrl {
    private List<IPlayerCtrl> players = new ArrayList<>();
    private static final Random RND = new Random();
    private final Scenario scenario;
    private List<IClientHandler> clients;
    
    public GameCtrl(List<IClientHandler> clients) {
        this.clients = clients;
        scenario = ScenarioFactory.getInstance().createScenario(clients.size());
    }

    /**
     * distributeCharacters gives each IPlayerControl a Player object which includes a
     * character. It sends name and backstory out to each player.
     */
    private void distributeCharacters() {
        List<GameCharacter> gamec = scenario.getCharacters();
        for(int i = 0; i < clients.size(); i++) {
            Player p = new Player(gamec.get(i), 10);
            IPlayerCtrl ctrl = new PlayerCtrl(p, clients.get(i));
            players.add(ctrl);
            
            String cname = ctrl.getCharacterName();
            String bc = ctrl.getPlayer().getCharacter().getBackstory();
            
            ctrl.writeToPlayer(AdventureText.printNameAndBackstory(cname, bc), false);
        }
        // TODO: Give players items.
        // Nice to have: The players can choose between different items in the beginning
    }
    
    @Override
    public void playGame() {
        distributeCharacters();
        while(true) {
            Event e = scenario.findNextEvent();
            boolean wonEvent = handleEvent(e);
            if(!wonEvent) {
                break;
            }
        }
        // Finish game
    }
    
    @Override
    public void writeToAll(String msg, boolean pressEnter) {
        for(IPlayerCtrl player: players) {
            player.writeToPlayer(msg, pressEnter);
        }
    }
    
    public boolean voteToRun() {
        int run = 0;
        int fight = 0;
        
        // Todo: Handle with futures!
        for(IPlayerCtrl p: players) {
            int res = p.getIntChoice(1, 2, "Press: \n\t1: run \n\t2: fight!");
            if(res == -1) {
                
            }
            if(res == 1) {
                run += 1;
            } else {
                fight += 1;
            }
        }
        return run > fight;
    }
    
    private IPlayerCtrl slowestPlayer() {
        IPlayerCtrl slowest = null;
        for(IPlayerCtrl ctrl: players) {
            Player p = ctrl.getPlayer();
            if(slowest == null || p.getSpeed() < slowest.getPlayer().getSpeed()) {
                slowest = ctrl;
            }
        }
        return slowest;
    }
    
    public boolean handleEvent(Event event) {
        if(event instanceof MonsterEvent) {
            MonsterEvent e = (MonsterEvent) event;
            writeToAll(e.getIntro() + e.getDescription(), false);
            
            boolean canRun = run(e.getMonster()); // TODO: Find slowest player
            writeToAll(AdventureText.runText(canRun), false);
            
            if(canRun) {
                boolean run = voteToRun();
                if(run) {
                    run();
                } else {
                    boolean won = fight(e.getMonster());
                    finishEvent(won);
                    if(!won) {
                        return false;
                    }
                }
            } else {
                    boolean won = fight(e.getMonster());
                    finishEvent(won);
                    if(!won) {
                        return false;
                    }
            }
         } else {
            // TODO: make merchant event
        }
        return true;
    }
    
    @Override
    public void endGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean run(Monster monster) {
        // TODO: Write the name of the player that is too slow
        IPlayerCtrl slow = slowestPlayer();
        if (monster.getSpeed() >= slow.getPlayer().getSpeed()) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * fight initiate the fight between all the players and the monster.
     *
     * A player attacks the monster first, and then the monster attack that
     * player.
     * 
     * If a player dies under the fight the battle is lost and the method will
     * return false.
     * 
     * @return true if the player wins, otherwise false.
     */
    public boolean fight(Monster monster) {
        // keep fighting till monster is dead!
        while (!monster.isDead()) {
            
            for (IPlayerCtrl ctrl : players) {
                // TODO: Give player choice to not attack
                Player p = ctrl.getPlayer();
                String name = p.getCharacter().getName();
                
                writeToCurrent(ctrl, "Press enter to attack");
                
                int playerAttack = p.attack();
                monster.loseHealth(playerAttack);
                
                if (monster.isDead()) {
                    // the monster have been slayn!
                    break;
                }
                int monsterAttack = monster.attack();
                p.loseHealth(monsterAttack);
                
                String s = name
                        + " has attacked. Monsters health: "
                        + monster.getHealth()
                        + "\nMonster attacked. " + name
                        + name + "'s health: " + p.getHealth();
                
                writeToAll(s, false);
                
                if (p.isDead()) {
                    // a player has died, and the fight is lost
                    return false;
                }
            }
        }
        
        return true;
    }
    
    private void writeToIdle(IPlayerCtrl notIdle, String msg) {
        for(IPlayerCtrl player: players) {
            if(player != notIdle) {
                player.writeToPlayer(msg, false);
            }
        }
    }
    
    private void writeToCurrent(IPlayerCtrl p, String msg) {
        p.pressEnter(msg);
    }
    
    public void run() {
        // Roll dice or something like that to see if they can outrun
        // The possibility should be calculated from the slowest player
        // and the monster's speed.
    }

    
    public void finishEvent(boolean won) {
        // TODO: Give player stuff if they win.
        if(won) {
            writeToAll("The monster has been defeated", false);
        } else {
            writeToAll("You have lost", false);
        }
    }
    
}
