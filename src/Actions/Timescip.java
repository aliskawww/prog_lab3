package Actions;

import Stuff.EActions;

import java.util.Random;

public class Timescip extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "Так прошел день, и наступил вечер";
            default -> "Прошло некоторое время";
        };
    }

    @Override
    public EActions getType() {
        return EActions.TIMESCIP;
    }
}

