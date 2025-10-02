package hexlet.code;

import java.util.Scanner;

public class EvenGame {

    public static void evenGame() {
        Cli.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int gameCount = 0;
        Scanner input = new Scanner(System.in);
        while (gameCount < 3) {
            int guessedNumber = (int) (Math.random() * 100.0);
            String trueAnswer;
            trueAnswer = guessedNumber % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + guessedNumber);
            String playerAnswer;
            playerAnswer = input.nextLine();
            if (trueAnswer.equals(playerAnswer)) {
                System.out.println("Correct!");
                gameCount++;
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + trueAnswer + "'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                gameCount = 0;
            }
        }
        System.out.println("Congratulations, " + Cli.name + "!");
    }
}
