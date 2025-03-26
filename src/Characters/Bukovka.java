package Characters;

import Stuff.Distraction;
import Stuff.EPerson;

public class Bukovka extends Persons{
    public Bukovka(String name, Distraction distraction) {
        super(name, distraction);
    }

    @Override
    public EPerson getType() {
        return EPerson.BUKOVKA;
    }
}
