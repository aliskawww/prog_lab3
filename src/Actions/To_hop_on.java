package Actions;

import Stuff.EActions;

import java.util.Random;

public class To_hop_on extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "мог наскочить на фонарный столб";
            case 1 -> "может наскочить на сугроб";
            default -> "может наскочить на мусорный бак";
        };
    }

    @Override
    public EActions getType() {
        return EActions.TO_HOP_ON;
    }
}

