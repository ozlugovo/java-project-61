package hexlet.code.games;

import java.util.Random;


public class Even {
    public static String parityCheckGame() {
        int randomInt;
        Random x = new Random();
        final int maxGenInt = 101;
        String correctAnswer;

        randomInt = x.nextInt(maxGenInt) + 1;
        if ((randomInt % 2) == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        System.out.println("Question: " + randomInt);
        return correctAnswer;
    }
}
