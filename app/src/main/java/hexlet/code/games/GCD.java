package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUNDTOWIN;

public class GCD {
    static final String RULES_OF_GAME_GCD = "Find the greatest common divisor of given numbers.";

    public static void gcdGame() {
        int randomIntOne;
        int randomIntTwo;
        final int lengthData = 2;
        String[][] questAndAsnwer = new String[ROUNDTOWIN][lengthData];

        for (int i = 0; i < ROUNDTOWIN; i++) {
            int maxGenInt = 101;
            randomIntOne = Utils.generateRandomInt(1, maxGenInt);
            randomIntTwo = Utils.generateRandomInt(1, maxGenInt);
            questAndAsnwer[i][0] = "Question: " + randomIntOne + ' ' + randomIntTwo;
            questAndAsnwer[i][1] = String.valueOf(gcdByBruteForce(randomIntOne, randomIntTwo));
        }
        Engine.engineGame(RULES_OF_GAME_GCD, questAndAsnwer);
    }

    public static int gcdByBruteForce(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
