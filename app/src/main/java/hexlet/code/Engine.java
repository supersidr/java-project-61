package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final Scanner scanner = new Scanner(System.in);

    public static boolean brainGame(String gameAnswer, String gameQuestion, String gameGreeting, String userName) {
        System.out.println(gameGreeting);
        System.out.println(gameQuestion);

        var correctAnswer = gameAnswer;
        String answer = scanner.nextLine();
        var result = answer.equals(correctAnswer);
        if (result) {
            System.out.println("Correct!");
            return result;
        } else {
            Messages.loose(answer, correctAnswer, userName);
            return result;
        }
    }
}
