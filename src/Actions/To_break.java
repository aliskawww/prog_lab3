package Actions;

import Stuff.EActions;

import java.util.Random;

public class To_break extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "и разбить себе лоб";
            case 1 -> "и разбить ноги";
            default -> "и разбить руки";
        };
    }

    @Override
    public EActions getType() {
        return EActions.TO_BREAK;
    }
}

