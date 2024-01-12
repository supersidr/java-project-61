package hexlet.code;

import java.util.Scanner;

public class Messages {
    public static String greetings() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static void win(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void loose(String answer, String correctAnswer, String userName) {
        System.out.println("'" + correctAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }

    public static void loose(int answer, int correctAnswer, String userName) {
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }
}
