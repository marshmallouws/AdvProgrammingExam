/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.event;

import data.actor.Merchant;

/**
 *
 * @author Annika
 */
public class MerchantEvent extends Event {
    
    private final Merchant merchant;
    
    public MerchantEvent(String intro, String outro, Merchant merchant) {
        super(intro, outro);
        this.merchant = merchant;
    }

    public Merchant getMerchant() {
        return merchant;
    }
}
