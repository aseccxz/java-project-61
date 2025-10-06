package hexlet.code.games;

public class PrimeGame {
    static final int MAX_NUMBER_VALUE = 100;
    static final int MIN_INDEX_TO_START = 3;

    public static void showGameRules(int gameCount) {
        if (gameCount == 0) {
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        }
    }
    public static String getSolution() {
        int guessedNumber = (int) (Math.random() * MAX_NUMBER_VALUE);
        System.out.println("Question: " + guessedNumber);
        if (guessedNumber < 2) {
            return "no";
        }
        if (guessedNumber == 2) {
            return "yes";
        }
        if (guessedNumber % 2 == 0) {
            return "no";
        }
        for (int i = MIN_INDEX_TO_START; i * i <= guessedNumber; i += 2) {
            if (guessedNumber % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
