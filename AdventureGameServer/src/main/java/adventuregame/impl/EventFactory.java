/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.impl;

import adventuregame.interfaces.IEvent;

/**
 *
 * @author Annika
 */
public class EventFactory {
    public IEvent getEvent(EventType event) {
        if(event == null) {
            return null;
        }
        
        switch(event) {
            case MONSTER:
                break;
            case HELPER:
                break;
            case MERCHANT:
                break;
        }
        return null; // DELETE
    }
}
