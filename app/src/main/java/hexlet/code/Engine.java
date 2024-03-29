package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;

    public static final int ROUNDS = 3;

    public static void brainGame(String gameGreeting, String[][] questionsAnswers) {
        var userName = Cli.greetings();
        System.out.println(gameGreeting);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questionsAnswers.length; i++) {
            var correctAnswer = questionsAnswers[i][ANSWER_ROW_NUMBER];
            System.out.println("Question: " + questionsAnswers[i][QUESTION_ROW_NUMBER]);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            var result = answer.equals(correctAnswer);
            if (result) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Congratulations, " + userName + "!");
        }
        scanner.close();
    }

}
