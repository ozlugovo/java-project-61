package hexlet.code.games;


import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.ROUNDTOWIN;


public class Even {
    public static void parityCheckGame() {
        int randomInt;
        Random x = new Random();
        final int maxGenInt = 101;
        final int lengthData = 2;
        String rulesOfGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questAndAsnwer = new String[ROUNDTOWIN][lengthData];

        for (int i = 0; i < ROUNDTOWIN; i++) {
            randomInt = x.nextInt(maxGenInt) + 1;
            questAndAsnwer[i][0] = "Question: "  + randomInt;
            if ((randomInt % 2) == 0) {
                questAndAsnwer[i][1] = "yes";
            } else {
                questAndAsnwer[i][1] = "no";
            }
        }
        Engine.engineGame(rulesOfGame, questAndAsnwer);
    }
}
