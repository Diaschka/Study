import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int quitGame = 0;
        do{
            int n = 10;
            int number = random.nextInt(n);
            int attemptsNumber = 3;
            System.out.println("Guess the number between 0 and " + (n-1) + ". You have " + attemptsNumber + " attempts. Go ahead!");
            int userNumber = scan.nextInt();
            for (int i = 0; i < attemptsNumber; i++) {
                if (userNumber == number){
                    System.out.println("Congrats! You won!");
                    break;
                } else if (userNumber > number){
                    System.out.println("Your number is bigger. You have " + (attemptsNumber - 1 - i) + " attempts.");
                } else {
                    System.out.println("Your number is smaller. You have " + (attemptsNumber - 1 - i) + " attempts.");
                }

                if (i < (attemptsNumber - 1)) {
                    System.out.println("Enter next number.");
                    userNumber = scan.nextInt();
                } else {
                    System.out.println("You lost.");
                }
            }
            System.out.println("Do you want to replay? 1- Yes. 0 - No.");
            quitGame = scan.nextInt();
        } while (quitGame == 1);
        scan.close();
    }
}





