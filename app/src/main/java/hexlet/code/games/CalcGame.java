package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

public class CalcGame {
    static final int MAX_NUMBER_VALUE = 100;
    static final int MAX_INDEX_VALUE = 2;
    static final int COLUMN_INDEX = 3;
    static final int ROW_INDEX = 2;

    public static int getCalculation(int firstNumber, int secondNumber, char operator) {
        return switch (operator) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default -> throw new RuntimeException("Unknown input: " + operator);
        };
    }

    public static void calcGame() {
        String gameRules = "What is the result of the expression?";
        String[][] questionsAndAnswers = new String[COLUMN_INDEX][ROW_INDEX];
        for (int i = 0; i < Engine.NUMBER_OF_GAMES; i++) {
            int firstNumber = Utils.generateNumber(0, MAX_NUMBER_VALUE);
            int secondNumber = Utils.generateNumber(0, MAX_NUMBER_VALUE);
            int operatorIndex = Utils.generateNumber(0, MAX_INDEX_VALUE);
            char[] operator = {'+', '-', '*'};
            int solution = getCalculation(firstNumber, secondNumber, operator[operatorIndex]);
            questionsAndAnswers[i][0] = firstNumber + " " + operator[operatorIndex] + " " + secondNumber;
            questionsAndAnswers[i][1] = Integer.toString(solution);
        }
        Engine.gameRun(gameRules, questionsAndAnswers);
    }
}
