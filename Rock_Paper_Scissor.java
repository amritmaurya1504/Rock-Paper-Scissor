import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    static void playGame() {
            Scanner scan = new Scanner(System.in);
            Random random = new Random();
            
            System.out.println("\n\n-----------------------");
            System.out.println("Choose out of Them : ");
            System.out.println("0 : Rock");
            System.out.println("1 : Paper");
            System.out.println("2 : Scissor");
            System.out.println("-----------------------\n");
            System.out.printf("Enter Your Choice : ");
            int userInput = scan.nextInt();
            
            // random number generator in computer
            int compInput = random.nextInt(3);
            
            // Logics
            if (userInput == compInput) {
                System.out.println("opps!! Match Drawn");
            } else if (userInput == 0 && compInput == 2 || userInput == 1 && compInput == 0
            || userInput == 2 && compInput == 1) {
                System.out.println("Hurray!! You Won");
            } else {
                System.out.println("Boo!! You Lost");
            }
            System.out.println("computer-Input : " + compInput);
    }

    public static void main(String[] args) {
        playGame();

    }
}