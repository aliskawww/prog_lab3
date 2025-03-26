package Characters;

import Stuff.EPerson;

public class Buddies extends Persons {
    public Buddies(String name) {
        super(name);
    }

    @Override
    public EPerson getType() {
        return EPerson.BUDDIES;
    }
}
