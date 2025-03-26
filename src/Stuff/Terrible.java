package Stuff;

public class Terrible extends RuntimeException {
    public Terrible(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Ужасного происществия не случилось";
    }

}
