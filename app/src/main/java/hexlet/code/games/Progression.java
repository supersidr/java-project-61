package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {
    public static final int MAX_NUMBER = 100;
    public static final int MAX_PROGRESSION_STEP = 10;
    public static final int MAX_SIZE_PROGRESSION = 10;
    public static final int MIN_SIZE_PROGRESSION = 5;
    public static final int GUESS_COUNT = 3;
    private static final String GAME_GREETING = "What number is missing in the progression?";
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;
    private static String[][] questionsAnswers = new String[GUESS_COUNT][2];


    public static void play() {
        int numbersInARow = MAX_SIZE_PROGRESSION - Engine.getRandNumber(MIN_SIZE_PROGRESSION);
        String[] progression = new String[numbersInARow];

        for (int i = 0; i < GUESS_COUNT; i++) {
            int hiddenNumberIndex = Engine.getRandNumber(numbersInARow);
            int increment = Engine.getRandNumber(MAX_PROGRESSION_STEP);
            int currentNumber = Engine.getRandNumber(MAX_NUMBER);
            Arrays.fill(progression, "");
            questionsAnswers[i][QUESTION_ROW_NUMBER] = "";
            for (int j = 0; j < numbersInARow; j++) {
                if (j != hiddenNumberIndex) {
                    progression[j] = String.valueOf(currentNumber);
                } else {
                    progression[j] = "..";
                    questionsAnswers[i][ANSWER_ROW_NUMBER] = String.valueOf(currentNumber);
                }
                currentNumber += increment;
            }
            questionsAnswers[i][QUESTION_ROW_NUMBER] = String.join(" ", progression);
        }
        Engine.brainGame(GAME_GREETING, questionsAnswers);
    }
}
