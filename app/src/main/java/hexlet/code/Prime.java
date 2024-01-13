package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void gamePrime() {
        var userName = Messages.greetings();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Random rand = new Random();

        var guessCount = 0;
        while (guessCount < App.GUESS_COUNT) {
            int maxRandom = App.MAX_NUMBER;
            int intRandom = rand.nextInt(maxRandom);
            var correctAnswer = "no";
            System.out.println("Question: " + intRandom);
            if (isPrime(intRandom)) {
                correctAnswer = "yes";
            }
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
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

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
