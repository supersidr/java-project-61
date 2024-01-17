package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static final int GUESS_COUNT = 3;
    public static final int MAX_NUMBER = 100;
    public static final int MAX_PROGRESSION_STEP = 10;
    public static final int SIZE_PROGRESSION = 10;
    public static final int MATH_ACTION_NUMBERS = 3;

    public static void gameEven() {
        var userName = Messages.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random rand = new Random();

        var guessCount = 0;
        while (guessCount < GUESS_COUNT) {
            int maxRandom = MAX_NUMBER;
            int intRandom = rand.nextInt(maxRandom);
            System.out.println("Question: " + intRandom);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            var correctAnswer = (intRandom % 2 == 0) ? "yes" : "no";
            var wrongAnswer = (intRandom % 2 == 0) ? "no" : "yes";
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                guessCount += 1;
            } else {
                Messages.loose(answer, correctAnswer, userName);
                break;
            }
        }
        if (guessCount == GUESS_COUNT) {
            Messages.win(userName);
        }
    }

}
