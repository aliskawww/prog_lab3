package Places;

import Stuff.EPlaces;

public class Library extends Places{
    public Library(String name) {
        super(name);
    }

    @Override
    protected EPlaces getType() {
        return EPlaces.LIBRARY;
    }
}
