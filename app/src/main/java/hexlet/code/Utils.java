package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();
    public static int generateRandomInt(int minGenInt, int maxGenInt) {
        return RANDOM.nextInt(minGenInt, maxGenInt);
    }
}
