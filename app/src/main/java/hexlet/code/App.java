package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit""");
        int gameChoice;
        Scanner input = new Scanner(System.in);
        gameChoice = input.nextInt();
        System.out.println("Your choice: " + gameChoice);
        switch (gameChoice) {
            case 1:
                Cli.greeting();
                break;
            case 2:
                EvenGame.evenGame();
                break;
        }
    }
}
