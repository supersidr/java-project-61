package hexlet.code;

public class App {
    public static void main(String[] args) {
        var game = Cli.chooseGame();
        if (game == 1){
            Messages.greetings();
        } else if (game == 2 ) {
            Even.gameEven();
        } else if (game == 3) {
            Calc.gameCalc();
        } else if (game == 4) {
            GCD.gameGCD();
        };
    }
}
