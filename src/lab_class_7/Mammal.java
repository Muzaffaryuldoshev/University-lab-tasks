package lab_class_7;

public class Mammal extends Animal {

    boolean isDomesticated;

    public Mammal(String name, int age, double weight, boolean isDomesticated) {
        super(name, age, weight);
        this.isDomesticated = isDomesticated;
    }

    @Override
    void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    void getVoice() {
        System.out.println(name+ " is making mammal noise");
    }

    void feedingMilk(){
        if(isDomesticated == true){
            System.out.println(name + " is feeding young at home");
        }else{
            System.out.println(name + " is feeding young near to the water");
        }
    }

    public boolean isDomesticated() { return isDomesticated; }
    public void setDomesticated(boolean domesticated) { isDomesticated = domesticated; }

    @Override
    public String toString() {
        return "Mammal{" +
                "isDomesticated=" + isDomesticated +
                '}';
    }
}
