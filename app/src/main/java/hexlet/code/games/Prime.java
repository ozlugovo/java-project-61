package hexlet.code.games;

import java.util.Random;

public class Prime {
    public static String primeGame() {
        Random x = new Random();
        String correctAnswer;
        final int minGenInt = 1;
        final int maxGenInt = 101;

        int randomInt = x.nextInt(minGenInt, maxGenInt);
        System.out.println("Question: " + randomInt);
        System.out.print("Your answer: ");
        correctAnswer = primeCheck(randomInt);
        return correctAnswer;
    }
    public static String primeCheck(int randomInt) {
        String correctAnswer = "yes";
        for (int i = 2; i < randomInt; i++) {
            if (randomInt % i == 0) {
                correctAnswer = "no";
                break;
            }
        }
        if (randomInt == 1) {
            correctAnswer = "no";
        }
        return correctAnswer;
    }

}
