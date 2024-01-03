package hexlet.code;

public class App {
    public static void main(String[] args) {
        var game = Cli.chooseGame();
        if (game == 1){
            Greet.greetings();
        } else if (game == 2 ) {
            Even.isEven();
        } else if (game ==3) {
            Calc.calcGame();
        };
    }
}
