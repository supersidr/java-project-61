package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final int MAX_NUMBER = 100;
    private static final int GUESS_COUNT = Engine.ROUNDS;
    private static final String GAME_GREETING = "Find the greatest common divisor of given numbers.";
    private static String[][] questionsAnswers = new String[GUESS_COUNT][2];
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;

    public static void play() {
        questionsAnswers= generateQuestionsAnswers();
        Engine.brainGame(GAME_GREETING, questionsAnswers);
    }

    private static String[][] generateQuestionsAnswers() {
        for (int i = 0; i < GUESS_COUNT; i++) {
            int questionNumber1 = Utils.getRandNumber(MAX_NUMBER);
            int questionNumber2 = Utils.getRandNumber(MAX_NUMBER);
            questionsAnswers[i][QUESTION_ROW_NUMBER] = questionNumber1 + " " + questionNumber2;
            questionsAnswers[i][ANSWER_ROW_NUMBER] = String.valueOf(calcGcd(questionNumber1, questionNumber2));
        }
        return questionsAnswers;
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
}
