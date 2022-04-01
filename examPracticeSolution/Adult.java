package examPracticeSolution;

public class Adult extends Person {

    public Adult(String name, int height) {
        super(name, height);
    }

    @Override
    public double ticketPrice() {
        return 15.99;
    }

    @Override
    public boolean canRide() {
        return this.getHeight() > 48;
    }
    
}
