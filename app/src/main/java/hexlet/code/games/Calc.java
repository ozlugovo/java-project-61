package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.*;

public class Calc {
    public static char mathAction() {
        char[] actionChars = new char[]{'+', '-', '*'};
        Random x = new Random();
        int i = x.nextInt(3);
        return actionChars[i];
    }
    public static void calcGame() {
        Random x = new Random();
        String userName = inNameUser();
        Scanner scanner = new Scanner(System.in);
        int randomIntOne;
        int randomIntTwo;
        char mathAction;
        int correctAnswer = 0;
        int rightAnswer = 0;

        welcomeUser(3, userName);

        while (rightAnswer < 3) {
            randomIntOne = x.nextInt(11);
            randomIntTwo = x.nextInt(11);
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
        if (rightAnswer == 3) {
            congratulationsUser(userName);
        }

    }
}
