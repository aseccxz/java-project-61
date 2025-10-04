package hexlet.code.games;

public class EvenGame {
    static final int MAX_NUMBER_VALUE = 100;

    public static void showGameRules(int gameCount) {
        if (gameCount == 0) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        }
    }
    public static String getSolution() {
        int guessedNumber = (int) (Math.random() * MAX_NUMBER_VALUE);
        System.out.println("Question: " + guessedNumber);
        return guessedNumber % 2 == 0 ? "yes" : "no";
    }
}
