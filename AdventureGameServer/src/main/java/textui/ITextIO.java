/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textui;

/**
 *
 * @author Annika
 */
public interface ITextIO {
    public int getInteger(int min, int max);
    public String getString();
    public boolean getYesOrNo();
    public int select();
}
