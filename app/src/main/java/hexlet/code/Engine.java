package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Engine {
    public static void engineGame(String numberGame) {
        Scanner scanner = new Scanner(System.in);
        int rightAnswer = 0;
        String correctAnswer;
        String answer;
        String userName = inNameUser(numberGame);
// остановился тут
        while (rightAnswer < 3) {
            correctAnswer = gameRound(numberGame);
            System.out.print("Your answer: ");
            answer = scanner.next();
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

    public static String inNameUser(String numberGame) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        switch (numberGame) {
            case "2" -> System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            case "3" -> System.out.println("What is the result of the expression?");
            case "4" -> System.out.println("Find the greatest common divisor of given numbers.");
            case "5" -> System.out.println("What number is missing in the progression?");
            case "6" -> System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            default -> System.out.println("Error, unknown game");


        }
        return userName;
    }

    public static String gameRound(String numberGame) {
        String correctAnswer = null;
        switch (numberGame) {
            case "2" -> correctAnswer = Even.parityCheckGame();
            case "3" -> correctAnswer = Calc.calcGame();
            case "4" -> correctAnswer = GCD.gcdGame();
            case "5" -> correctAnswer = Progression.hiddenNumberProg();
            case "6" -> correctAnswer = Prime.primeGame();
            default -> System.out.println("Error, unknown game");
        }
        return correctAnswer;
    }
    public static void incorrectAnswer(String answer, String correctAnswer, String userName) {
        System.out.print('\'' + answer + '\'' + " is wrong answer ");
        System.out.println(";(. Correct answer was " + '\'' + correctAnswer + '\'' + '.');
        System.out.println("Let's try again, " + userName + '!');
    }
    public static void congratulationsUser(String userName) {
        System.out.println("Congratulations, " + userName + '!');
    }
}