package lab_class_7;

public class Dog extends Mammal{

    String breed;

    public Dog(String name, int age, double weight, boolean isDomesticated, String breed) {
        super(name, age, weight, isDomesticated);
        this.breed = breed;
    }

    void walking(){
        System.out.println(breed + " dog is walking around the house.");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
