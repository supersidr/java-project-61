package hexlet.code.games;

import java.util.Random;
public class GCD implements Game {
    public static final int MAX_NUMBER = 100;

    public String getAnswer() {
        Random rand = new Random();

        int maxRandom = MAX_NUMBER;
        int intRandom1 = rand.nextInt(maxRandom) + 1;
        int intRandom2 = rand.nextInt(maxRandom) + 1;
        System.out.println("Question: " + intRandom1 + " " + intRandom2);
        var correctAnswer = GCD.calcGcd(intRandom1, intRandom2);
        return Integer.toString(correctAnswer);
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

    public void messageGameGreetings() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }
}
