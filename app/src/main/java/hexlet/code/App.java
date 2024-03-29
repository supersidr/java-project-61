package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Prime;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static final int GREET_GAME_ID = 1;
    public static final int EVEN_GAME_ID = 2;
    public static final int CALC_GAME_ID = 3;
    public static final int GCD_GAME_ID = 4;
    public static final int PROGRESSION_GAME_ID = 5;
    public static final int PRIME_GAME_ID = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        int gameNumber = scanner.nextInt();
        System.out.println("Your choice: " + gameNumber);
        switch (gameNumber) {
            case GREET_GAME_ID:
                Cli.greetings();
                break;
            case EVEN_GAME_ID:
                Even.play();
                break;
            case CALC_GAME_ID:
                Calc.play();
                break;
            case GCD_GAME_ID:
                GCD.play();
                break;
            case PROGRESSION_GAME_ID:
                Progression.play();
                break;
            case PRIME_GAME_ID:
                Prime.play();
                break;
            default:
                System.out.println("Incorrect input. Please type numbers from 0 to 6.");
                break;
        }
        scanner.close();
    }
}
