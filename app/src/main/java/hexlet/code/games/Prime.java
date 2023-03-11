package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUNDTOWIN;

public class Prime {
    static final String RULES_OF_GAME_PRIME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void primeGame() {
        final int lengthData = 2;
        String[][] questAndAsnwer = new String[ROUNDTOWIN][lengthData];

        for (int i = 0; i < ROUNDTOWIN; i++) {
            final int maxGenInt = 101;
            int randomInt = Utils.generateRandomInt(0, maxGenInt);
            questAndAsnwer[i][0] = "Question: " + randomInt;
            questAndAsnwer[i][1] = isPrime(randomInt) ? "yes" : "no";
        }
        Engine.engineGame(RULES_OF_GAME_PRIME, questAndAsnwer);
    }

    public static boolean isPrime(int randomInt) {
        if (randomInt < 2) {
            return false;
        }
        for (int i = 2; i < randomInt; i++) {
            if (randomInt % i == 0) {
                return false;
            }
        }
        return true;
    }
}
