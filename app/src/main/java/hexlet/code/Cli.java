package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static int chooseGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        int gameNumber = scanner.nextInt();
        System.out.println("Your choice: " + gameNumber);
//        scanner.close();
        return gameNumber;
    }
}
