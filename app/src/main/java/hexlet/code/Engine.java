package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDTOWIN = 3;

    public static void engineGame(String rulesOfGame, String[][] questAndAsnwer) {
        Scanner scanner = new Scanner(System.in);
        int rightAnswer = 0;

        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rulesOfGame);

        for (String[] roundInfo : questAndAsnwer) {
            System.out.println("Question: " + roundInfo[0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (roundInfo[1].equals(answer)) {
                System.out.println("Correct!");
                rightAnswer++;
            } else {
                System.out.print('\'' + answer + '\'' + " is wrong answer ");
                System.out.println(";(. Correct answer was " + '\'' + roundInfo[1] + '\'' + '.');
                System.out.println("Let's try again, " + userName + '!');
                break;
            }
        }
        if (rightAnswer == ROUNDTOWIN) {
            System.out.println("Congratulations, " + userName + '!');
        }
        scanner.close();
    }
}
