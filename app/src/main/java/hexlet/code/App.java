package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        String gameChoice;
        Scanner input = new Scanner(System.in);
        gameChoice = input.nextLine();
        if (!gameChoice.equals("0")) {
            System.out.println("Your choice: " + gameChoice);
            Engine.gameRun(gameChoice);
        }
    }
}
