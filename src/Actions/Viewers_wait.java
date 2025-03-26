package Actions;

import Stuff.EActions;

import java.util.Random;

public class Viewers_wait extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "что нельзя заставлять публику ждать";
            case 1 -> "что нельзя заставлять публику нервничать";
            default -> "что публике на нее плевать";
        };
    }

    @Override
    public EActions getType() {
        return EActions.VIEWERS_WAIT;
    }
}

