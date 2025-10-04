package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;

import java.util.Scanner;

public class Engine {
    public static void gameRun(int gameNum) {
        Cli.greeting();
        int gameCount = 0;
        String solution = "";
        String playerAnswer;
        Scanner input = new Scanner(System.in);
        while (gameCount < 3) {
            switch (gameNum) {
                case 2:
                    EvenGame.showGameRules(gameCount);
                    solution = EvenGame.getSolution();
                    break;
                case 3:
                    CalcGame.showGameRules(gameCount);
                    solution = CalcGame.getSolution();
                    break;
                case 4:
                    GCDGame.showGameRules(gameCount);
                    solution = GCDGame.getSolution();
            }
            playerAnswer = input.nextLine();
            if (solution.equals(playerAnswer)) {
                System.out.println("Correct!");
                gameCount++;
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + solution + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                break;
            }
        }
        if (gameCount == 3) {
            System.out.println("Congratulations, " + Cli.name + "!");
        }
    }
}
