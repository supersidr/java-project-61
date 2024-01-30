package hexlet.code.games;

import hexlet.code.Engine;


public class Calc {
    public static final int MAX_NUMBER = 100;
    public static final int MATH_ACTION_NUMBERS = 3;
    public static final int GUESS_COUNT = 3;
    private static final String GAME_GREETING = "What is the result of the expression?";
    private static String[][] questionsAnswers = new String[GUESS_COUNT][2];
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;
    private static final char[] MATH_OPERATORS = {'+', '-', '*'};

    public static void play() {
        for (int i = 0; i < GUESS_COUNT; i++) {
            int firstNum = Engine.getRandNumber(MAX_NUMBER);
            int secondNum = Engine.getRandNumber(MAX_NUMBER);
            int randomIndexOperator = Engine.getRandNumber(MATH_ACTION_NUMBERS);
            char operator = MATH_OPERATORS[randomIndexOperator];
            switch (operator) {
                case '+':
                    questionsAnswers[i][ANSWER_ROW_NUMBER] = String.valueOf(firstNum + secondNum);
                    break;
                case '-':
                    questionsAnswers[i][ANSWER_ROW_NUMBER] = String.valueOf(firstNum - secondNum);
                    break;
                default:
                    questionsAnswers[i][ANSWER_ROW_NUMBER] = String.valueOf(firstNum * secondNum);
                    break;
            }
            questionsAnswers[i][QUESTION_ROW_NUMBER] = firstNum + " " + operator + " " + secondNum;
        }
        Engine.brainGame(GAME_GREETING, questionsAnswers);
    }
}
