import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket client = null;
        Scanner scanner = new Scanner(System.in);
        try {
            client = new Socket("localhost",8189);
            System.out.println("Connected.");
            DataInputStream inputStream = new DataInputStream(client.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());

            Thread t = new Thread(()->{
                try{
                    while(true){
                        outputStream.writeUTF(scanner.nextLine());
                    }
                }catch(IOException e){
                    e.printStackTrace();
                }
            });
            t.setDaemon(true);
            t.start();

            while (true){
                String inEntry = inputStream.readUTF();
                if(inEntry.equals("/quit")){
                    System.out.println("Server is out.");
                    outputStream.writeUTF("/quit");
                    break;
                }else{
                    System.out.println("Server: " + inEntry);
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
