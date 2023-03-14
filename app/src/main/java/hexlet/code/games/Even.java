package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUNDTOWIN;


public class Even {
    static final String RULES_OF_GAME_EVEN = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void parityCheckGame() {
        int randomInt;
        final int lengthData = 2;
        String[][] questAndAsnwer = new String[ROUNDTOWIN][lengthData];

        for (int i = 0; i < ROUNDTOWIN; i++) {
            final int maxGenInt = 101;
            randomInt = Utils.generateRandomInt(0, maxGenInt);
            questAndAsnwer[i][0] = String.valueOf(randomInt);
            questAndAsnwer[i][1] = isEven(randomInt) ? "yes" : "no";
        }
        Engine.engineGame(RULES_OF_GAME_EVEN, questAndAsnwer);
    }
    public static boolean isEven(int random) {
        return random % 2 == 0;
    }
}
