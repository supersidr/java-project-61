package hexlet.code;

import java.util.Random;


public class Calc implements Game {
    public static final int MAX_NUMBER = 100;
    public static final int MATH_ACTION_NUMBERS = 3;

    public String getAnswer() {
        Random rand = new Random();
        int maxRandom = MAX_NUMBER;
        int mathActionNumbers = MATH_ACTION_NUMBERS;

        int intRandom1 = rand.nextInt(maxRandom);
        int intRandom2 = rand.nextInt(maxRandom);
        int mathActionNumber = rand.nextInt(mathActionNumbers);
        int correctAnswer = 0;
        if (mathActionNumber == 0) {
            System.out.println("Question: " + intRandom1 + " + " + intRandom2);
            correctAnswer = intRandom1 + intRandom2;
        } else if (mathActionNumber == 1) {
            System.out.println("Question: " + intRandom1 + " - " + intRandom2);
            correctAnswer = intRandom1 - intRandom2;
        } else if (mathActionNumber == 2) {
            System.out.println("Question: " + intRandom1 + " * " + intRandom2);
            correctAnswer = intRandom1 * intRandom2;
        }

        return Integer.toString(correctAnswer);
    }

    public void messageGameGreetings() {
        System.out.println("What is the result of the expression?");
    }
}
