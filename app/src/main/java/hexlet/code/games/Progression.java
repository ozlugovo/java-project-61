package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.inNameUser;
import static hexlet.code.Engine.welcomeUser;
import static hexlet.code.Engine.incorrectAnswer;
import static hexlet.code.Engine.congratulationsUser;

public class Progression {
    public static void hiddenNumberProg() {
        Random x = new Random();
        Scanner scanner = new Scanner(System.in);
        int rightAnswer = 0;
        final int needRightAnswer = 3;

        String userName = inNameUser();
        String gameName = "Progression";
        welcomeUser(gameName, userName);

        while (rightAnswer < needRightAnswer) {
            int[] progMassiv = getProgMassiv();
            int longMassiv = progMassiv.length;
            int i = x.nextInt(longMassiv);

            String[] secretNumb = toStringProgMassiv(progMassiv); // convert int massiv to String\
            String correctAnswer = String.valueOf(progMassiv[i]);
            secretNumb[i] = "..";

            System.out.print("Question: ");
            for (String numbs : secretNumb) {
                System.out.print(numbs + " ");
            }
            System.out.print("\nYour answer: ");
            String answer = scanner.next();
            if (correctAnswer.equals(answer)) {
                System.out.println("Correct!");
                rightAnswer++;
            } else {
                incorrectAnswer(answer, correctAnswer, userName);
                break;
            }
        }
        if (rightAnswer == needRightAnswer) {
            congratulationsUser(userName);
        }
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
