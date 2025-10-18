package lab_class_2;

import java.util.Scanner;

public class Task2 {
    static float earthWeighMuzaffar, marsGravityMuzaffar, marsWeightedMuzaffar;
    static double marsWeightDoubleMuzaffar;
    static int marsWeightIntMuzaffar;
    static char marsWeightCharMuzaffar;
    static int resultMuzaffar;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls Enter your weight in Earth: ");
        earthWeighMuzaffar = input.nextFloat();
        marsGravityMuzaffar = 0.38F;
        marsWeightedMuzaffar = earthWeighMuzaffar * 0.38F;
        System.out.println("Your weight in Mars is:  " + marsWeightedMuzaffar);

        // 3 - Assign result to a new double variable
        marsWeightDoubleMuzaffar = marsWeightedMuzaffar;

        // 4 - Print the double value with 4 decimal places
        System.out.printf("Your double weight in Mars is: %.4f%n",  marsWeightDoubleMuzaffar);

        // casting double value to int and printing result \
        marsWeightIntMuzaffar = (int)  marsWeightDoubleMuzaffar;
        System.out.println("Your weight casted to int in Mars is:  " + marsWeightIntMuzaffar);

        //int value casted to CHars
        marsWeightCharMuzaffar =  (char)marsWeightIntMuzaffar;
        System.out.println("Your weight in Mars casted to  chars is:  " + marsWeightCharMuzaffar);

        // doing math calculations
        resultMuzaffar = marsWeightCharMuzaffar - 10;
        System.out.println("Your weight in Mars after math operation is:  " + resultMuzaffar);
    }

}
