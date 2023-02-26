package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.*;

public class Calc {
    public static char mathAction() {
        char[] actionChars = new char[]{'+', '-', '*'};
        Random x = new Random();
        int i = x.nextInt(actionChars.length);
        return actionChars[i];
    }
    public static void calcGame() {
        Random x = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomIntOne;
        int randomIntTwo;
        char mathAction;
        int correctAnswer = 0;
        int rightAnswer = 0;
        final int needRighAnswer = 3;
        final int maxNumb = 10;

        String userName = inNameUser();
        String gameName = "Calc";
        welcomeUser(gameName, userName);

        while (rightAnswer < needRighAnswer) {
            randomIntOne = x.nextInt(maxNumb) + 1;
            randomIntTwo = x.nextInt(maxNumb) + 1;
            mathAction = mathAction();
            if (mathAction == '+') {
                correctAnswer = randomIntOne + randomIntTwo;
            } else if (mathAction == '-') {
                correctAnswer = randomIntOne - randomIntTwo;
            } else if (mathAction == '*') {
                correctAnswer = randomIntOne * randomIntTwo;
            }
            System.out.println("Question: " + randomIntOne + ' ' + mathAction + ' ' + randomIntTwo);
            System.out.print("Your answer: ");
            String answerString = scanner.next();
            int answer = Integer.parseInt(answerString);
            if (correctAnswer == answer) {
                System.out.println("Correct!");
                rightAnswer++;
            } else {
                incorrectAnswer(answerString, Integer.toString(correctAnswer), userName);
                break;
            }
        }
        if (rightAnswer == needRighAnswer) {
            congratulationsUser(userName);
        }

    }
}
