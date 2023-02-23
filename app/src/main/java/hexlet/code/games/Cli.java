package hexlet.code.games;

import static hexlet.code.Engine.inNameUser;
import static hexlet.code.Engine.welcomeUser;

public class Cli {
    public static void greet() {
        String userName = inNameUser();

        welcomeUser(1, userName);
    }
}
