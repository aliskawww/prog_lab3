package Actions;

import Stuff.EActions;

import java.util.Random;

public class Looked extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "все время выглядывала в окно,";
            case 1 -> "редко выглядывала в глазок,";
            default -> "никуда не выглядывала,";
        };
    }

    @Override
    public EActions getType() {
        return EActions.LOOKED;
    }
}

