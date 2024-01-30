package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static final int MAX_NUMBER = 100;
    public static final int GUESS_COUNT = 3;
    public static final String GAME_GREETING = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;
    private static String[][] questionsAnswers = new String[GUESS_COUNT][2];

    public static void play() {
        for (int i = 0; i < GUESS_COUNT; i++) {
            int questionNumber = Engine.getNumber(MAX_NUMBER);
            questionsAnswers[i][QUESTION_ROW_NUMBER] = String.valueOf(questionNumber);
            questionsAnswers[i][ANSWER_ROW_NUMBER] = (isPrime(questionNumber)) ? "yes" : "no";
        }
        Engine.brainGame(GAME_GREETING, questionsAnswers);
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
