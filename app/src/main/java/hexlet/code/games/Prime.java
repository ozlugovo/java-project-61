package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.*;

public class Prime {
    public static void primeGame() {
        Scanner scanner = new Scanner(System.in);
        Random x = new Random();
        String userName = inNameUser();
        String gameName = "Prime";
        welcomeUser(gameName, userName);
        int needRightAnswer = 3;
        int rightAnswer = 0;
        int minInt = 1;
        int maxInt = 101;
        while (rightAnswer < needRightAnswer) {
            int randomInt = x.nextInt(minInt, maxInt);
            System.out.println("Question: " + randomInt);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(primeCheck(randomInt))) {
                System.out.println("Correct!");
                rightAnswer++;
            } else {
                incorrectAnswer(answer, primeCheck(randomInt), userName);
                break;
            }
        }
        if (rightAnswer == 3) {
            congratulationsUser(userName);
        }
    }

    public static String primeCheck(int randomInt) {
        String correctAnswer = "no";
        int[] primeList = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        for (int j : primeList) {
            if (randomInt == j) {
                correctAnswer = "yes";
                break;
            }
        }
        return correctAnswer;
    }
}
