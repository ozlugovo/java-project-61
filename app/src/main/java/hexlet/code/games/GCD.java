package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.roundToWin;

public class GCD {
    public static void gcdGame() {
        Random x = new Random();
        int randomIntOne;
        int randomIntTwo;
        final int minGenInt = 1;
        final int maxGenInt = 101;
        String rulesOfGame = "Find the greatest common divisor of given numbers.";
        final int lengthData = 2;
        String[][] questAndAsnwer = new String[roundToWin][lengthData];

        for (int i = 0; i < roundToWin; i++) {
            randomIntOne = x.nextInt(minGenInt, maxGenInt);
            randomIntTwo = x.nextInt(minGenInt, maxGenInt);
            questAndAsnwer[i][0] = "Question: " + randomIntOne + ' ' + randomIntTwo;
            questAndAsnwer[i][1] = String.valueOf(gcdByBruteForce(randomIntOne, randomIntTwo));
        }
        Engine.engineGame(rulesOfGame, questAndAsnwer);
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
