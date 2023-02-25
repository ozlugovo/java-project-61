package hexlet.code;

import java.util.Scanner;

import static hexlet.code.games.Calc.calcGame;
import static hexlet.code.games.Cli.greet;
import static hexlet.code.games.Even.parityCheckGame;
import static hexlet.code.games.GCD.gcdGame;
import static hexlet.code.games.Prime.primeGame;
import static hexlet.code.games.Progression.hiddenNumberProg;


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

        if (gameChoose.equals("1")) {
            greet();
        }
        if (gameChoose.equals("2")) {
            parityCheckGame();
        }
        if (gameChoose.equals("3")) {
            calcGame();
        }
        if (gameChoose.equals("4")) {
            gcdGame();
        }
        if (gameChoose.equals("5")) {
            hiddenNumberProg();
        }
        if (gameChoose.equals("6")) {
            primeGame();
        }
    }
}
