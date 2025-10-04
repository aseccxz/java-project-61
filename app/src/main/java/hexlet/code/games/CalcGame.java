package hexlet.code.games;

public class CalcGame {
    public static void showGameRules(int gameCount) {
        if (gameCount == 0) {
            System.out.println("What is the result of the expression?");
        }
    }
    public static String getSolution() {
        int firstNumber = (int) (Math.random() * 20.0);
        int secondNumber = (int) (Math.random() * 20.0);
        int operatorIndex = (int) (Math.random() * 3.0);
        char[] operator = {'+', '-', '*'};
        int solution = 0;
        System.out.println("Question: " + firstNumber + " " + operator[operatorIndex] + " " + secondNumber);
        solution = switch (operator[operatorIndex]) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default -> solution;
        };
        return Integer.toString(solution);
    }
}
