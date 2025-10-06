package hexlet.code.games;

public class CalcGame {
    static final int MAX_NUMBER_VALUE = 100;
    static final int MAX_INDEX_VALUE = 3;
    public static void showGameRules(int gameCount) {
        if (gameCount == 0) {
            System.out.println("What is the result of the expression?");
        }
    }
    public static String getSolution() {
        int firstNumber = (int) (Math.random() * MAX_NUMBER_VALUE);
        int secondNumber = (int) (Math.random() * MAX_NUMBER_VALUE);
        int operatorIndex = (int) (Math.random() * MAX_INDEX_VALUE);
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
