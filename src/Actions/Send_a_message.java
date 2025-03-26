package Actions;

import Stuff.EActions;

import java.util.Random;

public class Send_a_message extends Actions {
    Random rand = new Random();
    @Override
    public String executeAction() {
        int n = rand.nextInt(0,3);
        return switch (n) {
            case 0 -> "кто-то сообразил сообщить об этом в газету.";
            case 1 -> "некто сообщил об этом в газету.";
            default -> "неизвестный сообщил об этом в газету.";
        };
    }

    @Override
    public EActions getType() {
        return EActions.SEND_A_MESSAGE;
    }
}

