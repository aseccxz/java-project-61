package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

public class ProgressionGame {
    static final int MAX_NUMBERS_LENGTH = 10;
    static final int MAX_NUMBER_VALUE = 100;
    static final int MAX_STEP_VALUE = 10;
    static final int MIN_STEP_VALUE = 1;
    static final int COLUMN_INDEX = 3;
    static final int ROW_INDEX = 2;

    public static String[] getProgression(int progressionLength, int startNumber, int step) {
        //StringBuilder printNumbers = new StringBuilder();
        String[] numbers = new String[progressionLength];
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = Integer.toString(startNumber + j * step);
        }
        return numbers;
    }

    public static void progressionGame() {
        String gameRules = "What number is missing in the progression?";
        String[][] questionsAndAnswers = new String[COLUMN_INDEX][ROW_INDEX];
        for (int i = 0; i < Engine.NUMBER_OF_GAMES; i++) {
            int startNumber = Utils.generateNumber(0, MAX_NUMBER_VALUE);
            int step = Utils.generateNumber(MIN_STEP_VALUE, MAX_STEP_VALUE);
            String[] numbers = getProgression(MAX_NUMBERS_LENGTH, startNumber, step);
            int hiddenNumberIndex = Utils.generateNumber(0, numbers.length);
            questionsAndAnswers[i][0] = String.join(" ", numbers).replace(numbers[hiddenNumberIndex], "..");
            questionsAndAnswers[i][1] = numbers[hiddenNumberIndex];
        }
        Engine.gameRun(gameRules, questionsAndAnswers);
    }
}
