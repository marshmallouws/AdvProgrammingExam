package server;

import java.io.IOException;

/**
 * @author Annika
 */
public interface IServerSocket {
    public void startServer(int port) throws IOException;
    public void sendMessage(String message);
    public String recieveMessage();
}
