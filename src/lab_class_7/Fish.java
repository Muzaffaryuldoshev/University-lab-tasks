package lab_class_7;

public class Fish extends Animal {

    double length;

    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    void eat() {
        System.out.println("Fish is eating small plants");
    }

    @Override
    void getVoice() {
        System.out.println("bulb bulb");
    }

    void swim(){
        System.out.println(length + " sm fish is swimming in the water");
    }

    public double getLength() { return length; }
    public void setLength(double length)  { this.length = length; }

    @Override
    public String toString() {
        return "Fish{" +
                "length=" + length +
                '}';
    }
}
