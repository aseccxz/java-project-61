package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

public class PrimeGame {
    static final int MAX_NUMBER_VALUE = 100;
    static final int COLUMN_INDEX = 3;
    static final int ROW_INDEX = 2;

    public static boolean isPrime(int number) {
        final int minIndex = 3;
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int j = minIndex; j * j <= number; j += 2) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeGame() {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[COLUMN_INDEX][ROW_INDEX];
        for (int i = 0; i < Engine.NUMBER_OF_GAMES; i++) {
            int guessedNumber = Utils.generateNumber(0, MAX_NUMBER_VALUE);
            questionsAndAnswers[i][0] = Integer.toString(guessedNumber);
            questionsAndAnswers[i][1] = isPrime(guessedNumber) ? "yes" : "no";
        }
        Engine.gameRun(gameRules, questionsAndAnswers);
    }
}
