package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.inNameUser;
import static hexlet.code.Engine.welcomeUser;
import static hexlet.code.Engine.incorrectAnswer;
import static hexlet.code.Engine.congratulationsUser;

public class Prime {
    public static void primeGame() {
        Scanner scanner = new Scanner(System.in);
        Random x = new Random();
        String userName = inNameUser();
        String gameName = "Prime";
        welcomeUser(gameName, userName);
        final int needRightAnswer = 3;
        int rightAnswer = 0;
        final int minGenInt = 1;
        final int maxGenInt = 101;
        while (rightAnswer < needRightAnswer) {
            int randomInt = x.nextInt(minGenInt, maxGenInt);
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
        if (rightAnswer == needRightAnswer) {
            congratulationsUser(userName);
        }
    }
    public static String primeCheck(int randomInt) {
        String correctAnswer = "yes";
        for (int i = 2; i < randomInt; i++) {
            if (randomInt % i == 0) {
                correctAnswer = "no";
                break;
            }
        }
        return correctAnswer;
    }

}
