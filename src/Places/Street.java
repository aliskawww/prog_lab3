package Places;

import Stuff.EPlaces;

public class Street extends Places{
    public Street(String name) {
        super(name);
    }

    @Override
    protected EPlaces getType() {
        return EPlaces.STREET;
    }
}
