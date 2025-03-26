package Actions;

import Stuff.EActions;

import java.util.Random;

public class Ride_call extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "объездили и обзвонили по телефону все отделения милиции и все больницы,";
            default -> "объездили и обзвонили все отделы полиции и все возможные больницы,";
        };
    }

    @Override
    public EActions getType() {
        return EActions.RIDE_CALL;
    }
}

