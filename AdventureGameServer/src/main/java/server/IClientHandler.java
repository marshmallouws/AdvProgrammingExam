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
    public String recieveMessage() throws IOException;
}
