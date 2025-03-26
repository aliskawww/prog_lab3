package Stuff;

public class Distracted extends RuntimeException {
    public Distracted(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Персонаж переволновался и потерял сознание.";
    }
}
