package hexlet.code.games;

public class PrimeGame {
    public static void showGameRules(int gameCount) {
        if (gameCount == 0) {
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        }
    }
    public static String getSolution() {
        int guessedNumber = (int) (Math.random() * 100.0);
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
        for (int i = 3; i * i <= guessedNumber ; i += 2) {
            if (guessedNumber % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
