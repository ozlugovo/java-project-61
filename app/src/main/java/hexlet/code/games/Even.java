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
            int maxGenInt = 101;
            randomInt = Utils.generateRandomInt(0, maxGenInt);
            questAndAsnwer[i][0] = "Question: "  + randomInt;
            questAndAsnwer[i][1] = parityCheck(randomInt);
        }
        Engine.engineGame(RULES_OF_GAME_EVEN, questAndAsnwer);
    }
    public static String parityCheck(int random) {
        if (random % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }

    }
}
