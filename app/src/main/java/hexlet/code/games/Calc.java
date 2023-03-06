package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUNDTOWIN;

public class Calc {
    static final String RULES_OF_GAME_CALC = "What is the result of the expression?";

    static final char[] ACTIONCHARS = new char[]{'+', '-', '*'};
    public static void calcGame() {
        final int lengthData = 2;
        String[][] questAndAsnwer = new String[ROUNDTOWIN][lengthData];

        for (int i = 0; i < ROUNDTOWIN; i++) {
            char mAction = mathAction();
            int maxGenInt = 10;
            int randomIntOne = Utils.generateRandomInt(0, maxGenInt);
            int randomIntTwo = Utils.generateRandomInt(0, maxGenInt);
            questAndAsnwer[i][1] = String.valueOf(calculate(randomIntOne, randomIntTwo, mAction));
            questAndAsnwer[i][0] = "Question: " + randomIntOne + ' ' + mAction + ' ' + randomIntTwo;
        }
        Engine.engineGame(RULES_OF_GAME_CALC, questAndAsnwer);
    }

    public static char mathAction() {
        int i = Utils.generateRandomInt(0, ACTIONCHARS.length);
        return ACTIONCHARS[i];
    }
    public static int calculate(int oneOperand, int twoOperand, char operator) {
        int result;
        result = switch (operator) {
            case '+' ->  (oneOperand + twoOperand);
            case '-' ->  (oneOperand - twoOperand);
            case '*' ->  (oneOperand * twoOperand);
            default -> 0;
        };
        return result;
    }
}
