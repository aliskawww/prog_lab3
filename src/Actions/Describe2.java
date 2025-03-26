package Actions;

import Stuff.EActions;

import java.util.Random;

public class Describe2 extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "Она была покрашена темнозеленой эмалевой краской. Сверху в ней была масса мелких дырочек, как в дуршлаге, а снизу ее охватывал блестящий никелированный поясок с более крупными отверстиями в виде глазок. Сбоку красивыми серебряными буквами была сделана надпись: \"Кибернетика\".";
            default -> "Она была покрашена ярко красной краской. Сверху в ней было очень много мелких дырочек, а снизу ее охватывал блестящий поясок с крупными отверстиями в виде глазок. Сбоку красивыми черными буквами была сделана надпись: \"Кибернетика\".";
        };
    }

    @Override
    public EActions getType() {
        return EActions.DESCRIBE2;
    }
}

