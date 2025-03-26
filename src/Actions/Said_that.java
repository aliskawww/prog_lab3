package Actions;

import Stuff.EActions;

import java.util.Random;

public class Said_that extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "В конце газетной статьи было сказано, чтобы каждый, кто знает что-либо о местонахождении Листика, сообщил об этом в редакцию.";
            case 1 -> "В конце газеты было сказано, чтобы каждый, кто знает что-либо о том, где находится Листик, сообщил об этом.";
            default -> "В начале газетной статьи было сказано, если кто-нибудь знает что-либо о местонахождении Листика, сообщил об этом в редакцию газеты.";
        };
    }

    @Override
    public EActions getType() {
        return EActions.SAID_THAT;
    }
}

