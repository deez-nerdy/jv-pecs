package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladesLength;

    public Bulldozer() {
    }

    public Bulldozer(int bladesLength) {
        this.bladesLength = bladesLength;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
