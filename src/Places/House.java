package Places;

import Stuff.EPlaces;

public class House extends Places{
    public House(String name) {
        super(name);
    }

    @Override
    protected EPlaces getType() {
        return EPlaces.HOUSE;
    }
}
