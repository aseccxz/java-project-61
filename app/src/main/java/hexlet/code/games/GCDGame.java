package hexlet.code.games;

public class GCDGame {
    static final int MAX_NUMBER_VALUE = 100;

    public static void showGameRules(int gameCount) {
        if (gameCount == 0) {
            System.out.println("Find the greatest common divisor of given numbers.");
        }
    }
    public static String getSolution() {
        int firstNumber = (int) (Math.random() * MAX_NUMBER_VALUE);
        int secondNumber = (int) (Math.random() * MAX_NUMBER_VALUE);
        int solution;
        System.out.println("Question: " + firstNumber + " " + secondNumber);
        while (secondNumber != 0) {
            int swapNumber;
            swapNumber = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = swapNumber;
        }
        solution = firstNumber;
        return Integer.toString(solution);
    }
}
