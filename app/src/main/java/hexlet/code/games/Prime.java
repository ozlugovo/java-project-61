package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.*;

public class Prime {
    public static void primeGame() {
        Scanner scanner = new Scanner(System.in);
        Random x = new Random();
        String userName = inNameUser();
        welcomeUser(6, userName);
        int rightAnswer = 0;
        while (rightAnswer < 3) {
            int randomInt = x.nextInt(0, 102);
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
        int[] primeList = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 47, 53, 59, 67, 71, 83, 89, 101};
        for (int j : primeList) {
            if (randomInt == j) {
                correctAnswer = "yes";
                break;
            }
        }
        return correctAnswer;
    }
}
