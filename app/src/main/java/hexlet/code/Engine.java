package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_GAMES = 3;

    public static void gameRun(String gameRules, String[][] questionsAndAnswers) {
        Scanner input = new Scanner(System.in);
        String playerAnswer;
        int gameCount = 0;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = input.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameRules);
        for (String[] questionAndAnswer : questionsAndAnswers) {
            String question = questionAndAnswer[0];
            String answer = questionAndAnswer[1];
            System.out.println(question);
            playerAnswer = input.next();
            if (answer.equals(playerAnswer)) {
                System.out.println("Correct!");
                gameCount++;
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

            if (gameCount == NUMBER_OF_GAMES) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
