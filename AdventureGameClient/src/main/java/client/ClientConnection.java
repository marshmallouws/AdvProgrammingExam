/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import com.google.gson.Gson;
import java.io.*;
import java.net.*;
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
    private static final Gson GSON = new Gson();
    
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
        String inputLine = in.readLine();
        JsonParser json = GSON.fromJson(inputLine, JsonParser.class);
        System.out.println(json.getMsg());
        return json.isToAnswer();
    }
    
    private String addNewLines(String message) {
        StringBuilder res = new StringBuilder();
        String[] msgArr = message.split(" ");
        
        int counter = 0;
        for(int i = 0; i < msgArr.length; i++) {
            res.append(msgArr[i]);
            if(counter == 14) {
                res.append("\n");
                counter = 0;
            } else {
                res.append(" ");
            }
            counter++;
        }
        return res.toString();
    }

    public void playGame() throws IOException {
        
        while (true) {
            String inputLine = in.readLine();
            JsonParser json = GSON.fromJson(inputLine, JsonParser.class);
            System.out.println(addNewLines(json.getMsg()));

            if (json.isToAnswer()) {
                if (json.getMax() != json.getMin()) {
                    while (true) {
                        String res = SCAN.nextLine();
                        try {
                            int i = Integer.parseInt(res);
                            if (i > json.getMax() || i < json.getMin()) {
                                System.out.println("Not a choice. Try again:");
                            } else {
                                sendMessage(res);
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Not a number. Try again:");
                        }
                    }
                } else {
                    sendMessage(SCAN.nextLine());
                }
            } else if(json.isPressEnter()) {
                sendMessage(SCAN.nextLine());
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        ClientConnection c = new ClientConnection();
        c.startConnection("127.0.0.1", 5555);

        c.playGame();
        c.stopConnection();
    }
}
