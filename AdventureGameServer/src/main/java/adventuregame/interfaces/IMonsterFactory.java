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
public interface IMonsterFactory {
    public int findNumberOfHeads();
    public int findNumberOfEyes(int noOfHeads);
    public int findStrength(int playersStrength);
    public int findSpeed();
    public int findHeight();
}
