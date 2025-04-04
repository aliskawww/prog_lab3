package Actions;

import Stuff.EActions;

import java.util.Random;

public class Choked extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "Задыхаясь от слез";
            default -> "Задыхаясь из-за истерики";
        };
    }

    @Override
    public EActions getType() {
        return EActions.CHOKED;
    }
}

