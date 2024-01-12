package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void gameGCD() {
        var userName = Messages.greetings();
        System.out.println("Find the greatest common divisor of given numbers.");
        Random rand = new Random();

        var guessCount = 0;
        while (guessCount < 3) {
            int maxRandom = 100;
            int intRandom1 = rand.nextInt(maxRandom);
            int intRandom2 = rand.nextInt(maxRandom);
            System.out.println("Question: " + intRandom1 + " " + intRandom2);
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            var correctAnswer = GCD.calcGcd(intRandom1, intRandom2);
            if (correctAnswer == answer) {
                System.out.println("Correct!");
                guessCount += 1;
            } else {
                Messages.loose(answer, correctAnswer, userName);
                break;
            }
        }
        if (guessCount == 3) {
            Messages.win(userName);
        }
    }

    public static int calcGcd(int x, int y) {
        int count = Math.min(x, y);

        for (int n = count; n >= 1; n--) {
            if (x % n == 0 && y % n == 0) {
                count = n;
                break;
            }
        }
        return count;
    }

}
