package hexlet.code;

import java.util.Scanner;

public class Engine {


    public static String inNameUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        return scanner.next();
    }
    public static void welcomeUser(int gameNumb, String userName) {

        System.out.println("Hello, " + userName + "!");
        switch (gameNumb) {
            case 2 -> System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            case 3 -> System.out.println("What is the result of the expression?");
            case 4 -> System.out.println("Find the greatest common divisor of given numbers.");
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
