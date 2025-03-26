package Places;

import Stuff.EPlaces;

public class Garden extends Places{
    public Garden(String name) {
        super(name);
    }

    @Override
    protected EPlaces getType() {
        return EPlaces.GARDEN;
    }
}
