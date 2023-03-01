package hexlet.code.games;

import java.util.Random;

public class Calc {
    public static char mathAction() {
        char[] actionChars = new char[]{'+', '-', '*'};
        Random x = new Random();
        int i = x.nextInt(actionChars.length);
        return actionChars[i];
    }

    public static String calcGame() {
        Random x = new Random();
        final int maxGenNumb = 10;
        int randomIntOne = x.nextInt(maxGenNumb) + 1;
        int randomIntTwo = x.nextInt(maxGenNumb) + 1;
        char mAction = mathAction();
        int correctAnswer = 0;

        if (mAction == '+') {
            correctAnswer = randomIntOne + randomIntTwo;
        } else if (mAction == '-') {
            correctAnswer = randomIntOne - randomIntTwo;
        } else if (mAction == '*') {
            correctAnswer = randomIntOne * randomIntTwo;
        }

        System.out.println("Question: " + randomIntOne + ' ' + mAction + ' ' + randomIntTwo);
        return Integer.toString(correctAnswer);
    }
}
