package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;
import java.util.Scanner;

public class Engine {
    static final int NUMBER_OF_GAMES = 3;

    public static void gameRun(String gameNum) {
        Cli.greeting();
        int gameCount = 0;
        String solution = "";
        String playerAnswer;
        Scanner input = new Scanner(System.in);
        while (gameCount < NUMBER_OF_GAMES) {
            if (gameNum.equals("1")) {
                break;
            }
            switch (gameNum) {
                case "2":
                    EvenGame.showGameRules(gameCount);
                    solution = EvenGame.getSolution();
                    break;
                case "3":
                    CalcGame.showGameRules(gameCount);
                    solution = CalcGame.getSolution();
                    break;
                case "4":
                    GCDGame.showGameRules(gameCount);
                    solution = GCDGame.getSolution();
                    break;
                case "5":
                    ProgressionGame.showGameRules(gameCount);
                    solution = ProgressionGame.getSolution();
                    break;
                case "6":
                    PrimeGame.showGameRules(gameCount);
                    solution = PrimeGame.getSolution();
                    break;
                default:
                    System.out.println("Unexpected input");
            }
            playerAnswer = input.nextLine();
            if (solution.equals(playerAnswer)) {
                System.out.println("Correct!");
                gameCount++;
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + solution + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
            }
        }
        if (gameCount == NUMBER_OF_GAMES) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}
