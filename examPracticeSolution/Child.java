package examPracticeSolution;

public class Child extends Person{

    private Adult chaperone;

    public Child(String name, int height) {
        super(name, height);
        chaperone = null;
    }

    public void assignChaperone(Adult chaperone) {
        this.chaperone = chaperone;
    }

    public boolean hasValidChaperone() {
        return chaperone != null && chaperone.canRide();
    }

    @Override
    public double ticketPrice() {
        return 10.99;
    }

    @Override
    public boolean canRide() {
        return (getHeight() > 48) || (getHeight() > 36 && hasValidChaperone());
    }
}
