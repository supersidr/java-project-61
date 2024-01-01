package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static String greetings() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
//        scanner.close();
        return userName;
    }
}
