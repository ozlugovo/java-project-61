package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateRandomInt(int minGenInt, int maxGenInt) {
        Random x = new Random();
        return x.nextInt(minGenInt, maxGenInt);
    }
}
