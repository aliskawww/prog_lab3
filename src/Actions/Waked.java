package Actions;

import Stuff.EActions;

import java.util.Random;

public class Waked extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "разбудил какой-то подозрительный шум.";
            case 1 -> "что-то разбудило.";
            default -> "разбудил какой-то шум в своей комнате.";
        };
    }

    @Override
    public EActions getType() {
        return EActions.WAKED;
    }
}

