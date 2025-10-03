package hexlet.code.games;

public class EvenGame {
    public static void gameRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
    public static String getSolution() {
        int guessedNumber = (int) (Math.random() * 100.0);
        System.out.println("Question: " + guessedNumber);
        String solution = guessedNumber % 2 == 0 ? "yes" : "no";
        return solution;
    }
}