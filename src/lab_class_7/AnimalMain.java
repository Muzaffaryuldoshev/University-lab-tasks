package lab_class_7;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Bird("Pigeon", 2, 10);
        animals[1] = new Mammal("Lion", 2, 100, false );
        animals[2] = new Fish("Shark", 2, 200);
//        for (Animal animal : animals) {
//            animal.eat();
//            animal.getVoice();
//        }
        System.out.println(animals[1] + " ");

    }
}
