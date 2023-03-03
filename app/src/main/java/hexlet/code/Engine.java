package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int roundToWin = 3;

    public static void engineGame(String rulesOfGame, String[][] questAndAsnwer) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        String userName;
        int rightAnswer = 0;

        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rulesOfGame);

        for (String[] strings : questAndAsnwer) {
            System.out.println(strings[0]);
            System.out.print("Your answer: ");
            answer = scanner.next();
            if (strings[1].equals(answer)) {
                System.out.println("Correct!");
                rightAnswer++;
            } else {
                incorrectAnswer(answer, strings[1], userName);
                break;
            }
        }
        if (rightAnswer == roundToWin) {
            System.out.println("Congratulations, " + userName + '!');
        }
        scanner.close();
    }


    public static void incorrectAnswer(String answer, String correctAnswer, String userName) {
        System.out.print('\'' + answer + '\'' + " is wrong answer ");
        System.out.println(";(. Correct answer was " + '\'' + correctAnswer + '\'' + '.');
        System.out.println("Let's try again, " + userName + '!');
    }

}
