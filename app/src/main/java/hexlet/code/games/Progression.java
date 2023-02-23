package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.*;

public class Progression {
    public static void hiddenNumberProg() {
        Random x = new Random();
        Scanner scanner = new Scanner(System.in);
        int rightAnswer = 0;

        String userName = inNameUser();
        welcomeUser(5, userName);

        while (rightAnswer < 3) {
            int[] progMassiv = getProgMassiv();
            int longMassiv = progMassiv.length;
            int i = x.nextInt(longMassiv);

            String[] secretNumb = toStringProgMassiv(progMassiv); // convert int massiv to String\
            String correctAnswer = String.valueOf(progMassiv[i]);
            secretNumb[i] = "..";

            System.out.print("Question: ");
            for (int iter = 0; iter < secretNumb.length - 1; iter++) {
                System.out.print(secretNumb[iter] + " ");
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
        if (rightAnswer == 3) {
            congratulationsUser(userName);
        }
    }
    public static int[] getProgMassiv() {
        Random x = new Random();
        int longProg = x.nextInt(10, 16);
        int[] progMassiv = new int[longProg];
        int starProg = x.nextInt(10);
        int stepProg = x.nextInt(2, 10);
        progMassiv[0] = starProg;

        for (int i = 1; i < longProg; i++) {
            progMassiv[i] = progMassiv[i - 1] + stepProg;
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
