package hexlet.code.games;

import hexlet.code.Engine;

public class GCDGame {
    static final int MAX_NUMBER_VALUE = 100;
    static final int NUMBER_OF_GAMES = 3;
    static final int COLUMN_INDEX = 3;
    static final int ROW_INDEX = 2;

    public static void gcdGame() {
        String gameRules = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndAnswers = new String[COLUMN_INDEX][ROW_INDEX];
        for (int i = 0; i < NUMBER_OF_GAMES; i++) {
            int firstNumber = (int) (Math.random() * MAX_NUMBER_VALUE);
            int secondNumber = (int) (Math.random() * MAX_NUMBER_VALUE);
            int solution;
            questionsAndAnswers[i][0] = "Question: " + firstNumber + " " + secondNumber;
            while (secondNumber != 0) {
                int swapNumber;
                swapNumber = firstNumber % secondNumber;
                firstNumber = secondNumber;
                secondNumber = swapNumber;
            }
            solution = firstNumber;
            questionsAndAnswers[i][1] = Integer.toString(solution);
        }
        Engine.gameRun(gameRules, questionsAndAnswers);
    }
}
