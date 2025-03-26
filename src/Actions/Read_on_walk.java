package Actions;

import Stuff.EActions;

import java.util.Random;

public class Read_on_walk extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "у него привычка читать на ходу книги";
            case 1 -> "он привык читать газету во время прогулки";
            default -> "у него привычка читать когда он ходит";
        };
    }

    @Override
    public EActions getType() {
        return EActions.READ_ON_WALK;
    }
}

