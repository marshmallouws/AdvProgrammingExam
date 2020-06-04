package game.adventuregame;

import adventuregame.impl.GameCtrl;
import java.io.IOException;
import java.util.List;
import server.IClientHandler;
import server.ServerConnection;
import staticstuff.GameCharacters;
import data.actor.GameCharacter;
import data.actor.Player;
import java.util.ArrayList;
import java.util.Random;
import adventuregame.impl.PlayerCtrl;
import adventuregame.interfaces.IPlayerCtrl;
import text.AdventureText;
/**
 *
 * @author Annika
 */
public class Main {
    public static void main(String[] args) {
        AdventureText gameText = new AdventureText();
        Random random = new Random();
        ServerConnection server = new ServerConnection();
        
        List<IPlayerCtrl> players = new ArrayList<>();
        
        try {
            server.startServer(5555);
            server.acceptClients(2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        List<IClientHandler> clients = server.getClients();
        List<GameCharacter> tmp = GameCharacters.characters;
        clients.forEach(c -> {
            GameCharacter character = tmp.get(random.nextInt(tmp.size()));
            tmp.remove(character);
            Player player = new Player(character);
            players.add(new PlayerCtrl(player, c));
            c.sendMessage(gameText.getWriteCharacterName(character.getName()));
        });
        
        GameCtrl gameCtrl = new GameCtrl(players);
        gameCtrl.startGame();
        gameCtrl.playGame();
    }
}
