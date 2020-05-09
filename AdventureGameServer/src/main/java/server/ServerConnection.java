/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Annika
 */
public class ServerConnection implements IServerSocket {

    private ServerSocket serverSocket;
    private List<ClientHandler> clients = new ArrayList<>();

    @Override
    public void startServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);

        // TODO: Find better way to find clients (Kill after given amount of seconds)
        int i = 0;
        while (i < 2) {
            ClientHandler h = new ClientHandler(serverSocket.accept());
            h.start();
            clients.add(h);
            i++;
        }
    }

    @Override
    public void sendMessage(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String recieveMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static class ClientHandler extends Thread {

        private Socket clientSocket;
        private PrintWriter out;
        private BufferedReader in;
        private String name;

        public ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }
    }
}
