package Actions;

import Stuff.EActions;

import java.util.Random;

public class Started_to_read extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "подождала сколько было положено";
            case 1 -> "подождала чуть больше положенного";
            default -> "подождала совсем чуть-чуть";
        };
    }

    @Override
    public EActions getType() {
        return EActions.STARTED_TO_READ;
    }
}

