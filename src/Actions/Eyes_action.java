package Actions;

import Stuff.EActions;

import java.util.Random;

public class Eyes_action extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "и из глаз закапали слезы.";
            case 1 -> "и из глаз потекли по щекам слезы.";
            default -> "и слезы потекли ручьем из глаз.";
        };
    }

    @Override
    public EActions getType() {
        return EActions.EYES_ACTION;
    }
}

