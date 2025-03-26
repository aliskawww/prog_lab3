package Places;

import Stuff.EPlaces;

public class Crossroad extends Places{
    public Crossroad(String name) {
        super(name);
    }

    @Override
    protected EPlaces getType() {
        return EPlaces.CROSSROAD;
    }
}
