//package hexlet.code.games;
//
//import java.util.Random;
//
//public final class Progression implements Game {
//    public static final int MAX_NUMBER = 100;
//    public static final int MAX_PROGRESSION_STEP = 10;
//    public static final int SIZE_PROGRESSION = 10;
//
//    public String getAnswer() {
//        int maxRandom = MAX_PROGRESSION_STEP;
//        Random rand = new Random();
//        int guessNumber = rand.nextInt(maxRandom);
//
//        int[] progression = genProgression();
//        System.out.print("Question:");
//        for (int i = 0; i < maxRandom; i++) {
//            if (i == guessNumber) {
//                System.out.print(" ..");
//            } else {
//                System.out.print(" " + progression[i]);
//            }
//        }
//        System.out.print("\n");
//
//        var correctAnswer = progression[guessNumber];
//        return Integer.toString(correctAnswer);
//    }
//
//    public static int[] genProgression() {
//        int sizeProgression = SIZE_PROGRESSION;
//        int[] x = new int[sizeProgression];
//        Random rand = new Random();
//        int maxFirst = MAX_NUMBER;
//        int maxStep = MAX_PROGRESSION_STEP;
//        int first = rand.nextInt(maxFirst);
//        int step = rand.nextInt(maxStep);
//        x[0] = first;
//        for (int i = 1; i < sizeProgression; i++) {
//            x[i] = x[i - 1] + step;
//        }
//        return x;
//    }
//
//    public void messageGameGreetings() {
//        System.out.println("What number is missing in the progression?");
//    }
//}
