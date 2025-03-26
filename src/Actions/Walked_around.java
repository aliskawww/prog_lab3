package Actions;

import Stuff.EActions;

import java.util.Random;

public class Walked_around extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "соскочил с постели и, согнувшись в три погибели, ходил за машиной следом, стараясь разглядеть ее.";
            case 1 -> "встал с кровати и, согнувшись, ходил за машинкой следом, пытаясь разглядеть ее.";
            default -> "спрыгнул с постели и, согнувшись очень низко, ходил за машиной, стараясь рассмотреть ее.";
        };
    }

    @Override
    public EActions getType() {
        return EActions.WALKED_AROUND;
    }
}

