package examPracticeSolution;

public abstract class Person implements Attendant{
    private String name;
    private int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name;
    }
}
