package hexlet.code.games;

public class EvenGame {
    public static void showGameRules(int gameCount) {
        if (gameCount == 0) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        }
    }
    public static String getSolution() {
        int guessedNumber = (int) (Math.random() * 100.0);
        System.out.println("Question: " + guessedNumber);
        return guessedNumber % 2 == 0 ? "yes" : "no";
    }
}