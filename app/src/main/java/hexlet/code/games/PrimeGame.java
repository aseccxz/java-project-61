package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeGame {
    static final int MAX_NUMBER_VALUE = 100;
    static final int MIN_INDEX_TO_START = 3;
    static final int NUMBER_OF_GAMES = 3;
    static final int COLUMN_INDEX = 3;
    static final int ROW_INDEX = 2;

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int j = MIN_INDEX_TO_START; j * j <= number; j += 2) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeGame() {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[COLUMN_INDEX][ROW_INDEX];
        for (int i = 0; i < NUMBER_OF_GAMES; i++) {
            int guessedNumber = (int) (Math.random() * MAX_NUMBER_VALUE);
            questionsAndAnswers[i][0] = "Question: " + guessedNumber;
            questionsAndAnswers[i][1] = isPrime(guessedNumber) ? "yes" : "no";
        }
        Engine.gameRun(gameRules, questionsAndAnswers);
    }
}
