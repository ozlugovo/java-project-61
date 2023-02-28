package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

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
            case "2" -> Even.parityCheckGame();
            case "3" -> Calc.calcGame();
            case "4" -> GCD.gcdGame();
            case "5" -> Progression.hiddenNumberProg();
            case "6" -> Prime.primeGame();
        }
        gameChooseScanner.close();
    }
}


