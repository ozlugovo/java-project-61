package hexlet.code.games;

import java.util.Random;

public class GCD {
    public static String gcdGame() {
        Random x = new Random();
        int randomIntOne;
        int randomIntTwo;
        int correctAnswer;
        final int minGenInt = 1;
        final int maxGenInt = 101;

        randomIntOne = x.nextInt(minGenInt, maxGenInt);
        randomIntTwo = x.nextInt(minGenInt, maxGenInt);
        System.out.println("Question: " + randomIntOne + ' ' + randomIntTwo);
        correctAnswer = gcdByBruteForce(randomIntOne, randomIntTwo);
        return Integer.toString(correctAnswer);
    }

    public static int gcdByBruteForce(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
