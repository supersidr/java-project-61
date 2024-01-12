package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    //    Я генерирую 1 случайное число до 100. Дальше я гененирую шаг прогрессии
//    случайное число до 10. Создаю массив из 10 символов. Генерирую загаданный номер числа.
//    Дальше вывожу на печать весь масстив через соут без лн с пробелом при выводе вместо счисла мечатаю две точки.
//    Сравниваю ответы и победа!
    public static void gameProgression() {
        var userName = Messages.greetings();
        System.out.println("What number is missing in the progression?");
        int maxRandom = 10;
        Random rand = new Random();
        int guessNumber = rand.nextInt(maxRandom);

        var guessCount = 0;

        while (guessCount < 3) {
            int[] progression = genProgression();
            System.out.print("Question:");
            for (int i = 0; i < maxRandom; i++) {
                if (i == guessNumber) {
                    System.out.print(" ..");
                } else {
                    System.out.print(" " + progression[i]);
                }
            }
            System.out.print("\n");

            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            var correctAnswer = progression[guessNumber];
            if (correctAnswer == answer) {
                System.out.println("Correct!");
                guessCount += 1;
            } else {
                Messages.loose(answer, correctAnswer, userName);
                break;
            }
        }
        if (guessCount == 3) {
            Messages.win(userName);
        }
    }

    public static int[] genProgression() {
        int sizeProgression = 10;
        int[] x = new int[sizeProgression];
        Random rand = new Random();
        int maxFirst = 100;
        int maxStep = 10;
        int first = rand.nextInt(maxFirst);
        int step = rand.nextInt(maxStep);
        x[0] = first;
        for (int i = 1; i < sizeProgression; i++) {
            x[i] = x[i - 1] + step;
        }
        return x;
    }
}
