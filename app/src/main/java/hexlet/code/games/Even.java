package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.*;


public class Even {
    public static void parityCheckGame() {
        int rightAnswer = 0;
        int randomInt;
        Random x = new Random();
        Scanner scanner = new Scanner(System.in);
        String userName = inNameUser();
        String gameName = "Even";

        welcomeUser(gameName, userName);

        while (rightAnswer < 3) {
            randomInt = x.nextInt(100) + 1;
            String correctAnswer;
            if ((randomInt % 2) == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            System.out.println("Question: " + randomInt);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (correctAnswer.equals(answer)) {
                System.out.println("Correct!");
                rightAnswer++;
            } else {
                incorrectAnswer(answer, correctAnswer, userName);
                break;
            }
        }
        if (rightAnswer == 3) {
            congratulationsUser(userName);
        }
    }
}
