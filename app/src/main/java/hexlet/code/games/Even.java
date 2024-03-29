package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final int MAX_NUMBER = 100;
    public static final int GUESS_COUNT = Engine.ROUNDS;
    public static final String GAME_GREETING = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;
    private static String[][] questionsAnswers = new String[GUESS_COUNT][2];

    public static void play() {
        questionsAnswers = generateQuestionsAnswers();
        Engine.brainGame(GAME_GREETING, questionsAnswers);
    }

    private static String[][] generateQuestionsAnswers() {
        for (int i = 0; i < GUESS_COUNT; i++) {
            int questionNumber = Utils.getRandNumber(MAX_NUMBER);
            questionsAnswers[i][QUESTION_ROW_NUMBER] = String.valueOf(questionNumber);
            questionsAnswers[i][ANSWER_ROW_NUMBER] = (isEven(questionNumber)) ? "yes" : "no";
        }
        return questionsAnswers;
    }

    private static boolean isEven(int currentNumber) {
        return currentNumber % 2 == 0;
    }

}
