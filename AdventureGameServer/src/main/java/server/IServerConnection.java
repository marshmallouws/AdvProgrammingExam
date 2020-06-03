package server;

import java.io.IOException;
import java.util.List;

/**
 * @author Annika
 */
public interface IServerConnection {
    public void startServer(int port) throws IOException;
    public void sendMessage(String message);
    public List<String> recieveMessage();
}
