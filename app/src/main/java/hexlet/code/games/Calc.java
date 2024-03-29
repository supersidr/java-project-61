package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    public static final int MAX_NUMBER = 100;
    public static final int MATH_ACTION_NUMBERS = 3;
    public static final int GUESS_COUNT = Engine.ROUNDS;
    private static final String GAME_GREETING = "What is the result of the expression?";
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;
    private static final char[] MATH_OPERATORS = {'+', '-', '*'};
    private static String[][] questionsAnswers = new String[GUESS_COUNT][2];

    public static void play() {
        questionsAnswers = generateQuestionsAnswers();
        Engine.brainGame(GAME_GREETING, questionsAnswers);
    }

    private static String[][] generateQuestionsAnswers() {
        for (int i = 0; i < GUESS_COUNT; i++) {
            int firstNum = Utils.getRandNumber(MAX_NUMBER);
            int secondNum = Utils.getRandNumber(MAX_NUMBER);
            char operator = getAnswer(i, firstNum, secondNum);
            questionsAnswers[i][QUESTION_ROW_NUMBER] = firstNum + " " + operator + " " + secondNum;
        }
        return questionsAnswers;
    }

    private static char getAnswer(int i, int firstNum, int secondNum) {
        char operator = getOperator();
        switch (operator) {
            case '+':
                questionsAnswers[i][ANSWER_ROW_NUMBER] = String.valueOf(firstNum + secondNum);
                break;
            case '-':
                questionsAnswers[i][ANSWER_ROW_NUMBER] = String.valueOf(firstNum - secondNum);
                break;
            case '*':
                questionsAnswers[i][ANSWER_ROW_NUMBER] = String.valueOf(firstNum * secondNum);
                break;
            default:
                System.out.println("Unknown operator " + operator);
        }
        return operator;
    }

    private static char getOperator() {
        int randomIndexOperator = Utils.getRandNumber(MATH_ACTION_NUMBERS);
        char operator = MATH_OPERATORS[randomIndexOperator];
        return operator;
    }
}
