package Actions;

import Stuff.EActions;

import java.util.Random;

public class Returned extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "Возвращаясь из библиотеки и увлекшись чтением книги,";
            case 1 -> "Он вернулся из магазина и увлекшись чтением новостей,";
            default -> "Возвращаясь с улицы и поглощенный чтением,";
        };
    }

    @Override
    public EActions getType() {
        return EActions.RETURNED;
    }
}

