/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame.interfaces;

import data.collectible.Item;
import java.util.List;

/**
 *
 * @author Annika
 */
public interface IPlayerCtrl {
    public String getName();
    public List<Item> getItems();
}
