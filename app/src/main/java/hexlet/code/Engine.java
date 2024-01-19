package hexlet.code;

import hexlet.code.games.Game;

import java.util.Scanner;

public class Engine {
    public static final int GUESS_COUNT = 3;

    public static void brainGame(Game game) {
        var userName = Messages.greetings();
        game.messageGameGreetings();
        var guessCount = 0;
        while (guessCount < GUESS_COUNT) {
            var correctAnswer = game.getAnswer();
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
        if (guessCount == GUESS_COUNT) {
            Messages.win(userName);
        }
    }
}
