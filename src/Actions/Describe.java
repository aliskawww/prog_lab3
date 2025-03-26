package Actions;

import Stuff.EActions;

import java.util.Random;

public class Describe extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "С виду она напоминала собой черепаху: такая же полукруглая в верхней части и плоская внизу.";
            default -> "Она была похожа на черепаху: такая же полукруглая сверху и плоская снизу.";
        };
    }

    @Override
    public EActions getType() {
        return EActions.DESCRIBE;
    }
}

