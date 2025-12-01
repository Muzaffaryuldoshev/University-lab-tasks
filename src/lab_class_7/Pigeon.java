package lab_class_7;

public class Pigeon extends Bird{
    String color;
    public Pigeon(String name, int age, double weight, String color) {
        super(name, age, weight);
        this.color = color;
    }

    void returnHome() {
        System.out.println(color + " pigeon is returning home");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "color='" + color + '\'' +
                '}';
    }


}
