package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random X = new Random();
    public static int generateRandomInt(int minGenInt, int maxGenInt) {
        return X.nextInt(minGenInt, maxGenInt);
    }
}
