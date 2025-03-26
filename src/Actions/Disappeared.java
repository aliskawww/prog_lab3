package Actions;

import Stuff.EActions;

import java.util.Random;

public class Disappeared extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "всегда был с ней, а теперь его вдруг не стало.";
            case 1 -> "не всегда был с ней, но теперь его не будет уже никогда.";
            default -> "был с ней, а теперь всегда будет один.";
        };
    }

    @Override
    public EActions getType() {
        return EActions.DISAPPEARED;
    }
}

