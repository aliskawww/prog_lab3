package Actions;

import Stuff.EActions;

import java.util.Random;

public class Touched extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "были очень тронуты горем Буковки и решии ей помочь.";
            default -> "были очень тронуты горем Буковки и стали ей помогать";
        };
    }

    @Override
    public EActions getType() {
        return EActions.TOUCHED;
    }
}

