package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;

    public static final int ROUNDS = 3;

    public static void brainGame(String gameGreeting, String[][] questionsAnswers) {
        var userName = Messages.greetings();
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
                Messages.loose(answer, correctAnswer, userName);
                return;
            }
            Messages.win(userName);
        }
        scanner.close();
    }

}
