import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws IOException {
        Socket client  = null;
        Scanner scanner = new Scanner(System.in);

        try {
            ServerSocket server = new ServerSocket(8189);
            System.out.println("Server is ready.");
            client = server.accept();
            System.out.println("Client is connected");
            DataInputStream inputStream = new DataInputStream(client.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());

            Thread t = new Thread(()->{
                try{
                    while(true){
                        outputStream.writeUTF(scanner.nextLine());
                    }
                } catch (IOException e){
                    e.printStackTrace();
                }
            });
            t.setDaemon(true);
            t.start();

            while (true) {
                String inEntry = inputStream.readUTF();

                if(inEntry.equals("/quit")){
                    System.out.println("Client left.");
                    outputStream.writeUTF("/quit");
                    break;
                } else {
                    System.out.println("Client: " + inEntry);
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        finally{
            try{
                client.close();
            }catch(NullPointerException | IOException e){
                e.printStackTrace();
            }
        }
    }
}
