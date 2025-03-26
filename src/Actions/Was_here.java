package Actions;

import Stuff.EActions;

import java.util.Random;

public class Was_here extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "недавно был здесь,";
            case 1 -> "уже давно не появлялся,";
            default -> "был только что,";
        };
    }

    @Override
    public EActions getType() {
        return EActions.WAS_HERE;
    }
}
