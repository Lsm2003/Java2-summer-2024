package Project.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Represents the main Server for connecting the Dealer to a Client
 * Provides the necessary method for connecting a Client to a Dealer using ServerSockets
 */
public class Server {
    private static final int PORT = 1234;

    /**
     * Main method for Server
     * connects a Client to a Dealer using port 1234
     * @param args
     */
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server running");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                new Thread(new Dealer(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}