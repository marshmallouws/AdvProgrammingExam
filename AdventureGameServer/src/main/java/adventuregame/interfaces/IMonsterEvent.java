/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.interfaces;

import data.actor.Monster;

/**
 *
 * @author Annika
 */
public interface IMonsterEvent extends IEvent {
    
    public Monster createMonster();
    public String getChoices(Monster monster, int slowestCharacter);
    public void fight();
    public void run();
    
}