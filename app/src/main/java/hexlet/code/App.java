package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greet;
import static hexlet.code.parityCheck.parityGame;

public class App {
    public static void main(String[] args) {
        Scanner gameChooseScanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        String gameChoose = gameChooseScanner.next();
        System.out.println("Your choice: " + gameChoose);

        if (gameChoose.equals("1")) {
            greet();
        }
        if (gameChoose.equals("2")) {
            parityGame();
        }
    }
}
