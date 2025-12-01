package lab_class_7;

public class Bird extends Animal {

    public Bird(String name, int age, double weight) {
        super(name, age, weight);
    }

    String featherColor;

    @Override
    void eat() {
        System.out.println("Bird is eating seeds");
    }

    @Override
    void getVoice() {
        System.out.println("chirp chirp");
    }

    void buildingNest() {
        System.out.println("Bird carrying sticks to build a nest ");
    }

    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                '}';
    }
}
