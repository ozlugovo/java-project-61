package hexlet.code;

import java.util.Scanner;

public class Engine {


    public static String inNameUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        return scanner.next();
    }
    public static void welcomeUser(String gameName, String userName) {

        System.out.println("Hello, " + userName + "!");
        switch (gameName) {
            case "Even" -> System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            case "Calc" -> System.out.println("What is the result of the expression?");
            case "GCD" -> System.out.println("Find the greatest common divisor of given numbers.");
            case "Progression" -> System.out.println("What number is missing in the progression?");
            case "Prime" -> System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            default -> System.out.println("Error, unknown game");
        }

    }
    public static void congratulationsUser(String userName) {
        System.out.println("Congratulations, " + userName + '!');
    }
    public static void incorrectAnswer(String answer, String correctAnswer, String userName) {
        System.out.print('\'' + answer + '\'' + " is wrong answer ");
        System.out.println(";(. Correct answer was " + '\'' + correctAnswer + '\'' + '.');
        System.out.println("Let's try again, " + userName + '!');
    }
}
