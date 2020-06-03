/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Annika
 */
public class ServerConnection implements IServerConnection {

    private ServerSocket serverSocket;
    private List<IClientHandler> clients = new ArrayList<>();
    
    /**
     * startServer starts the server of the game listening on the given port
     * 
     * @param port port number to run server on
     * @throws IOException 
     */
    @Override
    public void startServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }
    
    /**
     * acceptClients accepts new incoming clients for up to 3 players
     * 
     * @throws IOException
     */
    public void acceptClients(int numberOfPlayers) throws IOException {
        for (int i = 0; i < numberOfPlayers; i++) {
            ClientHandler c = new ClientHandler(serverSocket.accept());
            Thread t = new Thread(c);
            t.start();
            clients.add(c);
        }
    }
    
    public List<IClientHandler> getClients() {
        return clients;
    }
    
    /**
     * sendMessage sends a message to all clients
     * 
     * @param message 
     */
    @Override
    public void sendMessage(String message) {
        clients.forEach(c -> c.sendMessage(message));
    }
    
    /**
     * recieveMessage receives a message from a given client
     * 
     * @return 
     */
    @Override
    public List<String> recieveMessage() {
        List<String> messages = new ArrayList<>();
        for(IClientHandler c: clients) {
            String msg = null;
            try {
                msg = c.recieveMessage();
            } catch (IOException e) {
                e.printStackTrace(); // TODO: Find better thing to do
            }
            if(msg != null && !msg.isEmpty()) {
                messages.add(msg);
            }
        }
        return messages;
    }

    private static class ClientHandler implements Runnable, IClientHandler {

        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;
        // private String name;

        public ClientHandler(Socket socket) throws IOException {
            this.socket = socket;
            this.out = new PrintWriter(socket.getOutputStream());
            this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));   
        }
        
        public void sendMessage(String msg) {
            out.println(msg);
            out.flush();
        }
        
        public String recieveMessage() throws IOException {
            String msg = in.readLine();
            return msg;
        }

        @Override
        public void run() {
            while(true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ServerConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
