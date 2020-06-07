package game.adventuregame;

import adventuregame.impl.GameCtrl;
import java.io.IOException;
import java.util.List;
import server.IClientHandler;
import server.ServerConnection;

/**
 *
 * @author Annika
 */
public class Main {
    public static void main(String[] args) {
        ServerConnection server = new ServerConnection();

        try {
            server.startServer(5555);
            server.acceptClients(2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        List<IClientHandler> clients = server.getClients();
        
        GameCtrl gameCtrl = new GameCtrl(clients);
        gameCtrl.playGame();
    }
}
