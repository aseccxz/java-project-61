package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String name;

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        if (name == null) {
            System.out.print("May I have your name? ");
            Scanner input = new Scanner(System.in);
            name = input.nextLine();
        }
        System.out.println("Hello, " + name + "!");
    }
    public static String getName() {
        return name;
    }
}
