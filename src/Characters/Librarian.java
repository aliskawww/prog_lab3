package Characters;

import Stuff.EPerson;

public class Librarian extends Persons{
    public Librarian(String name) {
        super(name);
    }

    @Override
    public EPerson getType() {
        return EPerson.LIBRARIAN;
    }
}
