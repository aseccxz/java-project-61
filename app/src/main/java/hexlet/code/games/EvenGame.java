package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

public class EvenGame {
    static final int MAX_NUMBER_VALUE = 100;
    static final int COLUMN_INDEX = 3;
    static final int ROW_INDEX = 2;

    public static void evenGame() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[COLUMN_INDEX][ROW_INDEX];
        for (int i = 0; i < Engine.NUMBER_OF_GAMES; i++) {
            int guessedNumber = Utils.generateNumber(0, MAX_NUMBER_VALUE);
            String solution = guessedNumber % 2 == 0 ? "yes" : "no";
            questionsAndAnswers[i][0] = Integer.toString(guessedNumber);
            questionsAndAnswers[i][1] = solution;
        }
        Engine.gameRun(gameRules, questionsAndAnswers);
    }
}
