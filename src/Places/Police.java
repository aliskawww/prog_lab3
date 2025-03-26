package Places;

import Stuff.EPlaces;

public class Police extends Places{
    public Police(String name) {
        super(name);
    }

    @Override
    protected EPlaces getType() {
        return EPlaces.POLICE;
    }
}
