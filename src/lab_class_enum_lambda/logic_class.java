package lab_class_enum_lambda;

import static java.lang.Thread.*;

enum Ligts {
    RED,
    YELLOW,
    GREEN
}
public class logic_class {


    private Ligts currentLight;


    public void changeLight() {
        switch (currentLight) {
            case RED:
                currentLight = Ligts.YELLOW;
                break;

            case YELLOW:
                currentLight = Ligts.GREEN;
                break;

            case GREEN:
                currentLight = Ligts.RED;
                break;

        }
    }

    public String toString() {
        return "Current Light: " + currentLight;
    }

    public static void main(String[] args) {
        logic_class simulator = new logic_class();
       while (true) {
            System.out.println(simulator.toString());
            simulator.changeLight();

           try {
               sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        }



    }
}
