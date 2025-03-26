package Actions;

import Stuff.EActions;

import java.util.Random;

public class Took_book extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "взяла книгу для чтения";
            case 1 -> "взяла газету";
            default -> "ничего не взяла";
        };
    }

    @Override
    public EActions getType() {
        return EActions.TOOK_BOOK;
    }
}

