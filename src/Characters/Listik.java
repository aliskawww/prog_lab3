package Characters;

import Stuff.Distraction;
import Stuff.EPerson;

public class Listik extends Persons{
    public Listik(String name, Distraction distraction) {
        super(name, distraction);
    }

    @Override
    public EPerson getType() {
        return EPerson.LISTIC;
    }

}

