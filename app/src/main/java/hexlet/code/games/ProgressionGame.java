package hexlet.code.games;

import hexlet.code.Engine;

public class ProgressionGame {
    static final int MAX_NUMBERS_LENGTH = 9;
    static final int MAX_NUMBER_VALUE = 100;
    static final int MAX_STEP_VALUE = 10;
    static final int MIN_STEP_VALUE = 1;
    static final int COLUMN_INDEX = 3;
    static final int ROW_INDEX = 2;

    public static String getProgressionAndQuestion(int[] numbers, int startNumber, int step, int hiddenNumberIndex) {
        StringBuilder printNumbers = new StringBuilder("Question:");
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = startNumber + j * step;
            if (j == hiddenNumberIndex) {
                printNumbers.append(" ..");
            } else {
                printNumbers.append(" ").append(numbers[j]);
            }
        }
        return printNumbers.toString();
    }

    public static void progressionGame() {
        String gameRules = "What number is missing in the progression?";
        String[][] questionsAndAnswers = new String[COLUMN_INDEX][ROW_INDEX];
        for (int i = 0; i < Engine.NUMBER_OF_GAMES; i++) {
            int[] numbers = new int[MAX_NUMBERS_LENGTH];
            int startNumber = (int) (Math.random() * MAX_NUMBER_VALUE);
            int step = (int) (Math.random() * MAX_STEP_VALUE + MIN_STEP_VALUE);
            int hiddenNumberIndex = (int) (Math.random() * numbers.length);
            questionsAndAnswers[i][0] = getProgressionAndQuestion(numbers, startNumber, step, hiddenNumberIndex);
            questionsAndAnswers[i][1] = Integer.toString(numbers[hiddenNumberIndex]);
        }
        Engine.gameRun(gameRules, questionsAndAnswers);
    }
}
