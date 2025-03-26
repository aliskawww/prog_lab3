package Stuff;

public record Distraction(int value) {
    public Distraction addDistraction(int value) {
        return new Distraction(this.value + value);
    }

    public Distraction subDistraction(int value) {
        return new Distraction(this.value - value);
    }

    public boolean lost(){
        return this.value <= 0;
    }

}
