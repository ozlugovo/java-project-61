package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.*;

public class GCD {
    public static void gcdGame() {
        Random x = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomIntOne;
        int randomIntTwo;
        int correctAnswer;
        int needRightAnswer = 3;
        int rightAnswer = 0;

        String userName = inNameUser();
        String gameName = "GCD";
        welcomeUser(gameName, userName);
        int minInt = 1;
        int maxInt = 101;

        while (rightAnswer < needRightAnswer) {
            randomIntOne = x.nextInt(minInt, maxInt);
            randomIntTwo = x.nextInt(minInt, maxInt);
            System.out.println("Question: " + randomIntOne + ' ' + randomIntTwo);
            System.out.print("Your answer: ");
            String answerString = scanner.next();
            int answer = Integer.parseInt(answerString);
            correctAnswer = gcdByBruteForce(randomIntOne, randomIntTwo);
            if (correctAnswer == answer) {
                System.out.println("Correct!");
                rightAnswer++;
            } else {
                incorrectAnswer(answerString, Integer.toString(correctAnswer), userName);
                break;
            }
        }
        if (rightAnswer == needRightAnswer) {
            congratulationsUser(userName);
        }
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
