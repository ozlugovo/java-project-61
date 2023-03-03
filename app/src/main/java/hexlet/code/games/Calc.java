package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.roundToWin;

public class Calc {
    public static void calcGame() {
        Random x = new Random();
        final int maxGenNumb = 10;
        final int lengthData = 2;
        String rulesOfGame = "What is the result of the expression?";
        String[][] questAndAsnwer = new String[roundToWin][lengthData];

        for (int i = 0; i < roundToWin; i++) {
            char mAction = mathAction();
            int randomIntOne = x.nextInt(maxGenNumb) + 1;
            int randomIntTwo = x.nextInt(maxGenNumb) + 1;
            if (mAction == '+') {
                questAndAsnwer[i][1] = String.valueOf(randomIntOne + randomIntTwo);
            } else if (mAction == '-') {
                questAndAsnwer[i][1] = String.valueOf(randomIntOne - randomIntTwo);
            } else if (mAction == '*') {
                questAndAsnwer[i][1] = String.valueOf(randomIntOne * randomIntTwo);
            }
            questAndAsnwer[i][0] = "Question: " + randomIntOne + ' ' + mAction + ' ' + randomIntTwo;
        }
        Engine.engineGame(rulesOfGame, questAndAsnwer);
    }

    public static char mathAction() {
        char[] actionChars = new char[]{'+', '-', '*'};
        Random x = new Random();
        int i = x.nextInt(actionChars.length);
        return actionChars[i];
    }
}
