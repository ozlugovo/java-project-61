package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

import static hexlet.code.Engine.ROUNDTOWIN;

public class Progression {
    static final String RULES_OF_GAME_PROGRESSION = "What number is missing in the progression?";

    public static void numberProg() {
        Random x = new Random();

        final int lengthData = 2;
        String[][] questAndAsnwer = new String[ROUNDTOWIN][lengthData];

        for (int i = 0; i < ROUNDTOWIN; i++) {
            int[] progMassiv = generateProgression(generateLimitProgression());
            int longMassiv = progMassiv.length;
            int secretNumbCount = x.nextInt(longMassiv);

            String[] secretNumb = toStringProgMassiv(progMassiv); // convert int massiv to String
            questAndAsnwer[i][1] = String.valueOf(progMassiv[secretNumbCount]);
            secretNumb[secretNumbCount] = "..";
            questAndAsnwer[i][0] = "Question: " + String.join(" ", secretNumb);
        }
        Engine.engineGame(RULES_OF_GAME_PROGRESSION, questAndAsnwer);
    }
    public static int[] generateLimitProgression() {
        final int minlongProg = 10;
        final int maxlongProg = 16;
        final int maxStartProg = 10;
        final int maxstepProg = 16;
        final int lengthData = 3;
        int longProg = Utils.generateRandomInt(minlongProg, maxlongProg);
        int starProg = Utils.generateRandomInt(1, maxStartProg);
        int stepProg = Utils.generateRandomInt(2, maxstepProg);
        int[] limitProgression = new int[lengthData];
        limitProgression[0] = longProg;
        limitProgression[1] = starProg;
        limitProgression[2] = stepProg;
        return limitProgression;

    }
    public static int[] generateProgression(int[] limitProgression) {
        int longProg = limitProgression[0];
        int[] progMassiv = new int[longProg];
        int starProg = limitProgression[1];
        int stepProg = limitProgression[2];
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
