package hexlet.code.games;

public class GCDGame {
    public static void showGameRules(int gameCount) {
        if (gameCount == 0) {
            System.out.println("Find the greatest common divisor of given numbers.");
        }
    }
    public static String getSolution() {
        int firstNumber = (int) (Math.random() * 100.0);
        int secondNumber = (int) (Math.random() * 100.0);
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