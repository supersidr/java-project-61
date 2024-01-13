package hexlet.code;

public class App {
    public static final int GREET_GAME_ID = 1;
    public static final int EVEN_GAME_ID = 2;
    public static final int CALC_GAME_ID = 3;
    public static final int GCD_GAME_ID = 4;
    public static final int PROGRESSION_GAME_ID = 5;
    public static final int PRIME_GAME_ID = 6;
    public static final int GUESS_COUNT = 3;
    public static final int MAX_NUMBER = 100;
    public static final int MAX_PROGRESSION_STEP = 10;
    public static final int SIZE_PROGRESSION = 10;
    public static final int MATH_ACTION_NUMBERS = 3;

    public static void main(String[] args) {
        var game = Cli.chooseGame();
        if (game == GREET_GAME_ID) {
            Messages.greetings();
        } else if (game == EVEN_GAME_ID) {
            Even.gameEven();
        } else if (game == CALC_GAME_ID) {
            Calc.gameCalc();
        } else if (game == GCD_GAME_ID) {
            GCD.gameGCD();
        } else if (game == PROGRESSION_GAME_ID) {
            Progression.gameProgression();
        } else if (game == PRIME_GAME_ID) {
            Prime.gamePrime();
        }
    }
}
