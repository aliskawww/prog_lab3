package Actions;

import Stuff.EActions;

import java.util.Random;

public class Appeared extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "И вот на следующее утро появилась газета.";
            case 1 -> "На следующий день появилась газета";
            default -> "На следующий вечер газета уже появилась.";
        };
    }

    @Override
    public EActions getType() {
        return EActions.APPEARED;
    }
}

