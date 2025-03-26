package Characters;

import Stuff.EPerson;

public class Shorties extends Persons{
    public Shorties(String name) {
        super(name);
    }

    @Override
    public EPerson getType() {
        return EPerson.SHORTIES;
    }
}
