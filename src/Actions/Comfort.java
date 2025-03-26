package Actions;

import Stuff.EActions;

import java.util.Random;

public class Comfort extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "Все стали утешать ее";
            default -> "Все начали успокаивать ее";
        };
    }

    @Override
    public EActions getType() {
        return EActions.COMFORT;
    }
}

