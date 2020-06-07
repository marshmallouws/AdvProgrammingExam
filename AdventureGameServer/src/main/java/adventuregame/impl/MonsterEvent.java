/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.impl;

import adventuregame.interfaces.Event;
import adventuregame.interfaces.IMonsterEvent;
import data.actor.Monster;
import enums.MonsterType;
import adventuregame.interfaces.IPlayerCtrl;
import data.actor.Player;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import text.AdventureText;

/**
 *
 * @author Annika
 */
public class MonsterEvent extends Event {

    private final Monster monster;

    public MonsterEvent(Monster monster, String intro, String outro) {
        super(intro, outro);
        this.monster = monster;
    }
    
    public Monster getMonster() {
        return monster;
    }
    
    

    /*
    @Override
    public String startEvent() {
        List<String> intros = AdventureText.getMonsterIntros();
        String intro = intros.get(RND.nextInt(intros.size()));
        return intro;
    }

    @Override
    public String getChoices(int slowestCharacter) {
        if (monster.getSpeed() >= slowestCharacter) {
            return "You cannot outrun the monster, you need to stay and fight.";
        } else {
            return "You might be able to outrun the monster, but you can also choose to stay and fight.";
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
     
    @Override
    public boolean fight() {
        // keep fighting till monster is dead!
        while (!monster.isDead()) {
            for (IPlayerCtrl ctrl : players) {
                // TODO: Give player choice to not attack
                Player p = ctrl.getPlayer();
                int playerAttack = p.attack();
                monster.loseHealth(playerAttack);
                if (monster.isDead()) {
                    // the monster have been killed!
                    break;
                }
                int monsterAttack = monster.attack();
                p.loseHealth(monsterAttack);
                
                if (p.isDead()) {
                    // a dead player has died, and the fight is lost
                    return false;
                }
            }
        }
        
        return true;
    }

    @Override
    public void run() {
        // Roll dice or something like that to see if they can outrun
        // The possibility should be calculated from the slowest player
        // and the monster's speed.
    }

    @Override
    public String finishEvent() {
        // Write something about the aftermath. Give the players stuff
        // if they win
        return null;
    }
    */
}
