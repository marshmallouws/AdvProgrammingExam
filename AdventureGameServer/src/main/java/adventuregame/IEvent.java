/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import data.actor.Monster;
import data.actor.Player;
import java.util.List;

/**
 *
 * @author Annika
 */
public interface IEvent {
    // These are the events that happens during a scenario
    public void startEvent(Monster monster, List<Player> attendingPlayers);
}
