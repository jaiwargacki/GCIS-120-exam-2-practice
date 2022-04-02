package examPractice;

public class Child extends Person {
    private Adult chaperone;

    public Child(String name, int height){
        super(name, height);
    }

    public double ticketPrice() {
        return 10.99;
    }

    public void assignChaperone(Adult chaperone) {
        this.chaperone = chaperone;
    }

    private boolean hasValidChaperone() {
        //return chaperone != null && chaperone.canRide();
        if (chaperone != null) {
            return chaperone.getHeight() > 48;
        } else {
            return false;
        }
    }

    public boolean canRide() {
        if (getHeight() > 48) {
            return true;
        } else if (getHeight() > 36 && hasValidChaperone()) {
            return true;
        } else {
            return false;
        }
    }
}
