package hexlet.code;

import hexlet.code.games.Cli;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner gameChooseScanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        String gameChoose = gameChooseScanner.next();

        switch (gameChoose) {
            case "1" -> Cli.greet();
            case "2" -> Engine.engineGame("2");
            case "3" -> Engine.engineGame("3");
            case "4" -> Engine.engineGame("4");
            case "5" -> Engine.engineGame("5");
            case "6" -> Engine.engineGame("6");
            default -> System.out.println("Error, unknown game");
        }
        gameChooseScanner.close();
    }
}



