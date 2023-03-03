package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.roundToWin;

public class Prime {
    public static void primeGame() {
        Random x = new Random();

        final int lengthData = 2;
        String[][] questAndAsnwer = new String[roundToWin][lengthData];
        String rulesOfGame = "What number is missing in the progression?";

        final int minGenInt = 1;
        final int maxGenInt = 101;
        for (int i = 0; i < roundToWin; i++) {
            int randomInt = x.nextInt(minGenInt, maxGenInt);
            questAndAsnwer[i][0] = "Question: " + randomInt;
            System.out.print("Your answer: ");
            questAndAsnwer[i][1]  = primeCheck(randomInt);
        }
        Engine.engineGame(rulesOfGame, questAndAsnwer);
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
