/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textui;

import java.util.Scanner;

/**
 *
 * @author Bitten
 */
public class TextIO implements ITextIO {
    private static final Scanner SCAN = new Scanner(System.in);

    @Override
    public int getInteger(int min, int max) {
        while(true) {
            
        }
    }

    @Override
    public String getString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getYesOrNo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
