package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.ROUNDTOWIN;

public class Progression {
    public static void numberProg() {
        Random x = new Random();

        final int lengthData = 2;
        String[][] questAndAsnwer = new String[ROUNDTOWIN][lengthData];
        String rulesOfGame = "What number is missing in the progression?";

        for (int i = 0; i < ROUNDTOWIN; i++) {
            int[] progMassiv = getProgMassiv();
            int longMassiv = progMassiv.length;
            int secretNumbCount = x.nextInt(longMassiv);

            String[] secretNumb = toStringProgMassiv(progMassiv); // convert int massiv to String
            questAndAsnwer[i][1] = String.valueOf(progMassiv[secretNumbCount]);
            secretNumb[secretNumbCount] = "..";
            questAndAsnwer[i][0] = "Question: " + String.join(" ", secretNumb);
        }
        Engine.engineGame(rulesOfGame, questAndAsnwer);
    }
    public static int[] getProgMassiv() {
        Random x = new Random();
        final int minGenInt = 10;
        final int maxGenInt = 16;
        final int minGenIntStepProg = 2;
        final int maxGenIntStepProg = 16;
        final int minStartProgGenInt = 1;
        final int maxStartProgGenInt = 10;
        int longProg = x.nextInt(minGenInt, maxGenInt);
        int[] progMassiv = new int[longProg];
        int starProg = x.nextInt(minStartProgGenInt, maxStartProgGenInt);
        int stepProg = x.nextInt(minGenIntStepProg, maxGenIntStepProg);
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
