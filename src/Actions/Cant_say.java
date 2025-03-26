package Actions;

import Stuff.EActions;

import java.util.Random;

public class Cant_say extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "от волнения не могла произнести ни слова";
            default-> "из-за переживания ничего не смогла сказать";
        };
    }

    @Override
    public EActions getType() {
        return EActions.CANT_SAY;
    }
}

