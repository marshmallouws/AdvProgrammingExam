/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.*;
import java.io.*;
import java.util.Scanner;


/**
 *
 * @author Annika
 */
public class ClientConnection {

    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private static final Scanner SCAN = new Scanner(System.in);

    public void startConnection(String ip, int port) throws IOException {
        clientSocket = new Socket(ip, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    private void sendMessage(String msg) throws IOException {
        out.println(msg);
    }

    private void stopConnection() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
    }

    private boolean getMessage() throws IOException {
        return false;
    }

    public void playGame() throws IOException {
        while(true) {
            out.println("Hello Server");
            String a = in.readLine();
            System.out.println(a);
            if(a.equals("Hello client")) {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        ClientConnection c = new ClientConnection();
        c.startConnection("127.0.0.1", 5555);

        c.playGame();
        c.stopConnection();
    }
}
