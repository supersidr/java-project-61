package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void gameCalc() {
        var userName = Messages.greetings();
        System.out.println("What is the result of the expression?");
        Random rand = new Random();
        int maxRandom = 100;
        int mathActionNumbers = 3;

        var guessCount = 0;
        while (guessCount < 3){

            int intRandom1 = rand.nextInt(maxRandom);
            int intRandom2 = rand.nextInt(maxRandom);
            int mathActionNumber = rand.nextInt(mathActionNumbers);
            int correctAnswer = 0;
            if (mathActionNumber == 0){
                System.out.println("Question: " + intRandom1 + " + " + intRandom2);
                correctAnswer = intRandom1 + intRandom2;
            } else if (mathActionNumber == 1) {
                System.out.println("Question: " + intRandom1 + " - " + intRandom2);
                correctAnswer = intRandom1 - intRandom2;
            } else if (mathActionNumber == 2) {
                System.out.println("Question: " + intRandom1 + " * " + intRandom2);
                correctAnswer = intRandom1 * intRandom2;
            }

            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            System.out.println("Your answer: " + answer);

            if (correctAnswer == answer) {
                System.out.println("Correct!");
                guessCount +=1;
            } else {
                Messages.loose(answer, correctAnswer, userName);
                break;
            }
        }
        if (guessCount == 3) {
            Messages.win(userName);
        }
    }
}
