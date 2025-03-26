package Places;

import Stuff.EPlaces;

public class Hospital extends Places{
    public Hospital(String name) {
        super(name);
    }

    @Override
    protected EPlaces getType() {
        return EPlaces.HOSPITAL;
    }
}
