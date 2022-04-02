package examPractice;

public class Adult extends Person {

    public Adult(String name, int height) {
        super(name, height);
    }

    @Override
    public boolean canRide() {
        //return getHeight() > 48;

        if (getHeight() > 48) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double ticketPrice() {
        return 15.99;
    }
    
}
