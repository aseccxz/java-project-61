package hexlet.code.games;

public class CalcGame {
    public static void gameRules() {
        System.out.println("What is the result of the expression?");
    }
    public static String getSolution() {
        int firstNumber = (int) (Math.random() * 20.0);
        int secondNumber = (int) (Math.random() * 20.0);
        int operatorIndex = (int) (Math.random() * 3.0);
        char[] operator = {'+', '-','*'};
        int solution = 0;
        System.out.println("Question: " + firstNumber + " " + operator[operatorIndex] + " " + secondNumber);
        switch (operator[operatorIndex]) {
            case '+':
                solution = firstNumber + secondNumber;
                break;
            case '-':
                solution = firstNumber - secondNumber;
                break;
            case '*':
                solution = firstNumber * secondNumber;
                break;
        }
        return Integer.toString(solution);
    }
}
