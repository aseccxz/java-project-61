package hexlet.code.games;

public class ProgressionGame {
    static final int MAX_NUMBERS_LENGTH = 9;
    static final int MAX_NUMBER_VALUE = 100;
    static final int MAX_STEP_VALUE = 10;
    static final int MIN_STEP_VALUE = 1;

    public static void showGameRules(int gameCount) {
        if (gameCount == 0) {
            System.out.println("What number is missing in the progression?");
        }
    }
    public static String getSolution() {
        int[] numbers = new int[MAX_NUMBERS_LENGTH];
        int startNumber = (int) (Math.random() * MAX_NUMBER_VALUE);
        int step = (int) (Math.random() * MAX_STEP_VALUE + MIN_STEP_VALUE);
        int hiddenNumberIndex = (int) (Math.random() * numbers.length);
        StringBuilder printNumbers = new StringBuilder("Question:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = startNumber + i * step;
            if (i == hiddenNumberIndex) {
                printNumbers.append(" ..");
            } else {
                printNumbers.append(" ").append(numbers[i]);
            }
        }
        System.out.println(printNumbers);
        return Integer.toString(numbers[hiddenNumberIndex]);
    }
}
