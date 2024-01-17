package hexlet.code;

public class App {
    public static final int GREET_GAME_ID = 1;
    public static final int EVEN_GAME_ID = 2;
    public static final int CALC_GAME_ID = 3;
    public static final int GCD_GAME_ID = 4;
    public static final int PROGRESSION_GAME_ID = 5;
    public static final int PRIME_GAME_ID = 6;

    public static void main(String[] args) {
        var game = Cli.chooseGame();
        switch (game) {
            case GREET_GAME_ID:
                Messages.greetings();
                break;
            case CALC_GAME_ID:
                Calc.gameCalc();
                break;
            case EVEN_GAME_ID:
                Even.gameEven();
                break;
            case GCD_GAME_ID:
                GCD.gameGCD();
                break;
            case PROGRESSION_GAME_ID:
                Progression.gameProgression();
                break;
            case PRIME_GAME_ID:
                Prime.gamePrime();
                break;
            default:
                break;
        }
    }
}
