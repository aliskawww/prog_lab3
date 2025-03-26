package Places;

import Stuff.EPlaces;

public class Book_theatre extends Places{
    public Book_theatre(String name) {
        super(name);
    }

    @Override
    protected EPlaces getType() {
        return EPlaces.BOOK_THEATRE;
    }
}
