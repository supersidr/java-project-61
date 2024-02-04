package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final int MAX_NUMBER = 100;
    public static final int GUESS_COUNT = Engine.ROUNDS;
    public static final String GAME_GREETING = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;
    private static String[][] questionsAnswers = new String[GUESS_COUNT][2];

    public static void play() {
        questionsAnswers = generateQuestionAnswers();
        Engine.brainGame(GAME_GREETING, questionsAnswers);
    }

    private static String[][] generateQuestionAnswers() {
        for (int i = 0; i < GUESS_COUNT; i++) {
            int questionNumber = Utils.getRandNumber(MAX_NUMBER);
            questionsAnswers[i][QUESTION_ROW_NUMBER] = String.valueOf(questionNumber);
            questionsAnswers[i][ANSWER_ROW_NUMBER] = (isPrime(questionNumber)) ? "yes" : "no";
        }
        return questionsAnswers;
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
}
