package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        String gameChoice;
        Scanner input = new Scanner(System.in);
        gameChoice = input.nextLine();
        switch (gameChoice) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                EvenGame.evenGame();
                break;
            case "3":
                CalcGame.calcGame();
                break;
            case "4":
                GCDGame.gcdGame();
                break;
            case "5":
                ProgressionGame.progressionGame();
                break;
            case "6":
                PrimeGame.primeGame();
                break;
            default:
                System.out.println("Unexpected input");
        }
    }
}
