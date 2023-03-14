package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUNDTOWIN;

public class Progression {
    static final String RULES_OF_GAME_PROGRESSION = "What number is missing in the progression?";

    public static void numberProg() {

        final int lengthData = 2;
        String[][] questAndAsnwer = new String[ROUNDTOWIN][lengthData];

        for (int i = 0; i < ROUNDTOWIN; i++) {
            final int minlongProg = 10;
            final int maxlongProg = 16;
            final int maxStartProg = 10;
            final int maxstepProg = 16;
            int longProg = Utils.generateRandomInt(minlongProg, maxlongProg);
            int starProg = Utils.generateRandomInt(1, maxStartProg);
            int stepProg = Utils.generateRandomInt(2, maxstepProg);

            int[] progMassiv = generateProgression(longProg, starProg, stepProg);
            int longMassiv = progMassiv.length;
            int secretNumbCount = Utils.generateRandomInt(0, longMassiv);

            String[] secretNumb = toStringProgMassiv(progMassiv); // convert int massiv to String
            questAndAsnwer[i][1] = String.valueOf(progMassiv[secretNumbCount]);
            secretNumb[secretNumbCount] = "..";
            questAndAsnwer[i][0] = String.join(" ", secretNumb);
        }
        Engine.engineGame(RULES_OF_GAME_PROGRESSION, questAndAsnwer);
    }

    public static int[] generateProgression(int longProg, int starProg, int stepProg) {
        int[] progMassiv = new int[longProg];
        progMassiv[0] = starProg;

        for (int i = 1; i < longProg; i++) {
            progMassiv[i] = starProg + stepProg * i;
        }
        return progMassiv;
    }

    public static String[] toStringProgMassiv(int[] progMassiv) {
        String[] convertedArr = new String[progMassiv.length];
        for (int i = 0; i < progMassiv.length; i++) {
            convertedArr[i] = String.valueOf(progMassiv[i]);
        }
        return convertedArr;
    }
}
