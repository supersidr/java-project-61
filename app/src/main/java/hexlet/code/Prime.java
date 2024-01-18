package hexlet.code;

import java.util.Random;

public class Prime implements Game {
    public static final int MAX_NUMBER = 100;

    public String getAnswer() {

        Random rand = new Random();

        int maxRandom = MAX_NUMBER;
        int intRandom = rand.nextInt(maxRandom);
        var correctAnswer = "no";
        System.out.println("Question: " + intRandom);
        if (isPrime(intRandom)) {
            correctAnswer = "yes";
        }
        return correctAnswer;
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

    @Override
    public void messageGameGreetings() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
}
