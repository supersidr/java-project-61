package hexlet.code.games;

import java.util.Random;

public final class Even implements Game {

    public static final int MAX_NUMBER = 100;

    public String getAnswer() {
        Random rand = new Random();
        int maxRandom = MAX_NUMBER;
        int intRandom = rand.nextInt(maxRandom);
        System.out.println("Question: " + intRandom);
        var correctAnswer = (intRandom % 2 == 0) ? "yes" : "no";
        return correctAnswer;
    }

    public void messageGameGreetings() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
