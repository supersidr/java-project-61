package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void gameEven() {
        var userName = Messages.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random rand = new Random();

        var guessCount = 0;
        while (guessCount < App.GUESS_COUNT) {
            int maxRandom = App.MAX_NUMBER;
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
        if (guessCount == App.GUESS_COUNT) {
            Messages.win(userName);
        }
    }

}
