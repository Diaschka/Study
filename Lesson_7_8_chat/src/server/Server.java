package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;

public class Server {
    private List<ClientHandler> clients;
    private AuthService authService;

    public Server() {
        clients = new Vector<>();
        authService = new SimpleAuthService();
        ServerSocket server = null;
        Socket socket;

        final int PORT = 8189;

        try {
            server = new ServerSocket(PORT);
            System.out.println("Server is running.");

            while (true) {
                socket = server.accept();
                System.out.println("Client is connected.");
                new ClientHandler(this, socket);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void broadcastMsg(String nick,String msg){
        for (ClientHandler c:clients) {
            c.sendMsg(nick + ": " + msg);
        }
    }

    public void privateMsg(ClientHandler sender, String receiver, String message) {
        String privateMessage = String.format("This message is private. From user [ %s ] to [ %s ]: [ %s ] ",sender.getNick(),receiver,message);

        for (ClientHandler c: clients) {
            if(c.getNick().equalsIgnoreCase(receiver)){
                c.sendMsg(privateMessage);
                if(!sender.getNick().equals(receiver)){
                    sender.sendMsg(privateMessage);
                }
                return;
            }
        }
        sender.sendMsg("User" + receiver + "is not found.");
    }


    public void subscribe(ClientHandler clientHandler){
        clients.add(clientHandler);
    }

    public void unsubscribe(ClientHandler clientHandler){
        clients.remove(clientHandler);
    }

    public AuthService getAuthService() {
        return authService;
    }
}
