package Actions;

import Stuff.EActions;

import java.util.Random;

public class Find extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "нигде обнаружен не был.";
            case 1 -> "нигде не обнаружили.";
            default -> "не нашли.";
        };
    }

    @Override
    public EActions getType() {
        return EActions.FIND;
    }
}

