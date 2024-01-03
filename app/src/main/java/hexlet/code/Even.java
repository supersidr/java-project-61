package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void isEven() {
        var userName = Greet.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random rand = new Random();

        var guessCount = 0;
        while (guessCount < 3){
            int maxRandom = 100;
            int intRandom = rand.nextInt(maxRandom);
            System.out.println("Question: " + intRandom);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            var correctAnswer = (intRandom % 2 == 0) ? "yes" : "no";
            var wrongAnswer = (intRandom % 2 == 0) ? "no" : "yes";
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                guessCount +=1;
            } else {
                System.out.println("'" + correctAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (guessCount == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

}
