package hexlet.code;

public class Utils {
    public static int getRandNumber(int minValue, int maxValue) {
        int number = (int) Math.floor(Math.random() * (maxValue - minValue + 1)) + minValue;
        return number;
    }

    public static int getRandNumber(int maxValue) {
        int number = (int) Math.floor(Math.random() * (maxValue));
        return number;
    }
}
