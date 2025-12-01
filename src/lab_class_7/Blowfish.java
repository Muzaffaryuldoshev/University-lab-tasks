package lab_class_7;

public class Blowfish extends Fish{
    double maxDepth;

    public Blowfish(String name, int age, double weight) {
        super(name, age, weight);
    }

    void searchingFood() {
        System.out.println(getName() + " went to the max depth of " + maxDepth + " to search for food.");
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }

    @Override
    public String toString() {
        return "Blowfish{" +
                "maxDepth=" + maxDepth +
                '}';
    }
}
