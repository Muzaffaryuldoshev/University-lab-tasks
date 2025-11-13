package lab_class_3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task3QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //asking for 3 abc numbers
        System.out.println("Enter the number a: ");
        float a = input.nextFloat();

        System.out.println("Enter the number b: ");
        float b = input.nextFloat();

        System.out.println("Enter the number c: ");
        float c = input.nextFloat();

        // checkinf if mostly a is not equal to 0, otherwise i won't be quadratic equation
        if (a == 0.0f) {
            System.out.println("The equation is not quadratic");
        } else if (b == 0.0f) {
            if (c == 0.0f) {
                System.out.println("The equation is not valid. /n Try Again): ");
            }
        }

        // calculation delta
        double delta = b * b - 4.0 * a * c;
        int rootsCount;

        //Determine number of roots
        if (delta < 0) {
            rootsCount = 0;  // no real roots
        } else if (Math.abs(delta) < 1e-9) {// extremely close to zero {
            rootsCount = 1;  // one root
        } else {
            rootsCount = 2;  // two roots
        }

       // Using switch to print result
        switch (rootsCount) {
            case 0:
                System.out.println("No real roots (delta < 0)");
                break;

            case 1:
                double x = -b / (2.0 * a);
                System.out.printf("One real root: x = ", x);
                break;

            case 2:
                double sqrtDelta = Math.sqrt(delta);
                double x1 = (-b - sqrtDelta) / (2.0 * a);
                double x2 = (-b + sqrtDelta) / (2.0 * a);
                System.out.printf("Two real roots: x1 = " + x1 + " x2 = " + x2);
                break;
        }
        input.close();
    }
}
