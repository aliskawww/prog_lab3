package Actions;

import Stuff.EActions;

import java.util.Random;

public class Saw extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "увидел на полу, недалеко от кровати, странную маленькую машину, которая ползала по комнате от одной стены к другой и непрерывно жужжала";
            default -> "увидел на полу, около шкафа, странную небольшую машинку, которая каталась по комнате от одной стены к другой и непрерывно шумела";
        };
    }

    @Override
    public EActions getType() {
        return EActions.SAW;
    }
}

