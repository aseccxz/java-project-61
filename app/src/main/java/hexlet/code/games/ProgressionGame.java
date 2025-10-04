package hexlet.code.games;

public class ProgressionGame {
    public static void showGameRules(int gameCount) {
        if (gameCount == 0) {
            System.out.println("What number is missing in the progression?");
        }
    }
    public static String getSolution() {
        int[] numbers = new int[9];
        int startNumber = (int) (Math.random() * 100.0);
        int step = (int) (Math.random() * 10.0 + 1.0);
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
