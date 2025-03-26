package Places;

import Stuff.EPlaces;

public abstract class Places {
    protected String name;

    protected Places(String name) {
        this.name = name;
    }

    protected abstract EPlaces getType();

    public String getName() {
        return this.name;
    }
}
