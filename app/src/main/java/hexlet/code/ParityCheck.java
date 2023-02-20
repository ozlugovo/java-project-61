package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class ParityCheck {
    public static void parityGame() {
        int rightAnswer = 0;
        int randomInt;
        Random x = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");


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
                System.out.print('\'' + answer + '\'' + " is wrong answer ");
                System.out.println(";(. Correct answer was " + '\'' + correctAnswer + '\'' + '.');
                System.out.println("Let's try again, " + userName + '!');
                break;
            }
        }
        if (rightAnswer == 3) {
            System.out.println("Congratulations, " + userName + '!');
        }
    }
}
