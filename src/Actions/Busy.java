package Actions;

import Stuff.EActions;

import java.util.Random;

public class Busy extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "все лавочки уже были заняты слушателями, которые с нетерпением ожидали начала";
            default -> "все места не были заняты слушателями";
        };
    }

    @Override
    public EActions getType() {
        return EActions.BUSY;
    }
}

