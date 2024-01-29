package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Messages;

import java.util.Random;

public class Even {
    public static final int MAX_NUMBER = 100;
    public static final int GUESS_COUNT = 3;
    public static final String GAME_GREETING = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void play() {
        var guessCount = 0;
        var userName = Messages.greetings();
        var result = true;
        while (guessCount < GUESS_COUNT && result) {
            var number = getNumber();
            var correctAnswer = (number % 2 == 0) ? "yes" : "no";
            var gameQuestion = "Question: " + number;
            result = Engine.brainGame(correctAnswer, gameQuestion, GAME_GREETING, userName);
            guessCount += 1;
        }
        if (guessCount == 3) {
            Messages.win(userName);
        }
    }

    private static int getNumber() {
        Random random = new Random();
        var number = random.nextInt(MAX_NUMBER);
        return number;
    }

}
