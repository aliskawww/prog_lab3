package Actions;

import Stuff.EActions;

import java.util.Random;

public class Head_action extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "Голова беспомощно опустилась над книгой";
            default -> "Голова с грустью опустилась над книгой";
        };
    }

    @Override
    public EActions getType() {
        return EActions.HEAD_ACTION;
    }
}

