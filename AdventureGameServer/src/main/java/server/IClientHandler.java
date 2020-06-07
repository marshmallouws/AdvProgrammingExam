/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;

/**
 *
 * @author Annika
 */
public interface IClientHandler {
    public void sendMessage(String message);
    public void write(String msg, boolean pressEnter);
    public String recieveMessage() throws IOException;
    public int getIntChoice(int min, int max, String choices) throws IOException;
    public boolean pressEnter(String message) throws IOException;
}
