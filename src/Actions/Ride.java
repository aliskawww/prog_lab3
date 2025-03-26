package Actions;

import Stuff.EActions;

import java.util.Random;

public class Ride extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "стали ездить по всем отделения м милиции, другие принялись ездить по больницам.";
            case 1 -> "поехали в отдели полиции, другие поехали по больницам.";
            default -> "взялись за отдления милиции, другие за больницы.";
        };
    }

    @Override
    public EActions getType() {
        return EActions.RIDE;
    }
}

