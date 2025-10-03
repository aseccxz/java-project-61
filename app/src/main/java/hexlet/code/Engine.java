package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class Engine {
    public static void gameRun(int gameNum) {
        Cli.greeting();
        boolean showGameRules = true;
        int gameCount = 0;
        String solution = "";
        String playerAnswer;
        Scanner input = new Scanner(System.in);
        while (gameCount < 3) {
            switch (gameNum) {
                case 2:
                    if (showGameRules) {
                        EvenGame.gameRules();
                        showGameRules = false;
                    }
                    solution = EvenGame.getSolution();
                    break;
                case 3:
                    if (showGameRules) {
                        CalcGame.gameRules();
                        showGameRules = false;
                    }
                    solution = CalcGame.getSolution();
                    break;
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
