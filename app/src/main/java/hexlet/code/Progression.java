package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Progression {

    public static void gameProgression() {
        var userName = Messages.greetings();
        System.out.println("What number is missing in the progression?");
        int maxRandom = App.MAX_PROGRESSION_STEP;
        Random rand = new Random();
        int guessNumber = rand.nextInt(maxRandom);

        var guessCount = 0;

        while (guessCount < App.GUESS_COUNT) {
            int[] progression = genProgression();
            System.out.print("Question:");
            for (int i = 0; i < maxRandom; i++) {
                if (i == guessNumber) {
                    System.out.print(" ..");
                } else {
                    System.out.print(" " + progression[i]);
                }
            }
            System.out.print("\n");

            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            var correctAnswer = progression[guessNumber];
            if (correctAnswer == answer) {
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

    public static int[] genProgression() {
        int sizeProgression = App.SIZE_PROGRESSION;
        int[] x = new int[sizeProgression];
        Random rand = new Random();
        int maxFirst = App.MAX_NUMBER;
        int maxStep = App.MAX_PROGRESSION_STEP;
        int first = rand.nextInt(maxFirst);
        int step = rand.nextInt(maxStep);
        x[0] = first;
        for (int i = 1; i < sizeProgression; i++) {
            x[i] = x[i - 1] + step;
        }
        return x;
    }
}
