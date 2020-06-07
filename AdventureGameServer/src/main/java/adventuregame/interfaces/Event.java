/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.interfaces;

/**
 *
 * @author Annika
 */
public abstract class Event {
    private final String intro;
    private final String outro;
    
    public Event(String intro, String outro) {
        this.intro = intro;
        this.outro = outro;
    }

    public String getIntro() {
        return intro;
    }

    public String getOutro() {
        return outro;
    }
}
