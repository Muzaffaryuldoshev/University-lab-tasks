package lab_class_3;

import java.util.Scanner;

public class Task2BMICalculation {
    public class Task2BMI {
        public static void main(String[] args) {
            // importing scanner
            Scanner sc = new Scanner(System.in);

            // asking for height and weight
            System.out.print("Enter height in meters: ");
            float height = sc.nextFloat();

            System.out.print("Enter weight in kilograms: ");
            float weight = sc.nextFloat();

            if (height <= 0) {
                System.out.println("Height must be positive.");
                sc.close();
                return;
            }

            float bmi = (float) (weight / Math.pow(height, 2));
            System.out.printf("BMI: %.2f%n", bmi);

            // Intervals from the PDF:
            if (bmi < 16.00f) {
                System.out.println("Category: starvation");
            } else if (bmi >= 16.00f && bmi <= 16.99f) {
                System.out.println("Category: emaciation");
            } else if (bmi >= 17.00f && bmi <= 18.49f) {
                System.out.println("Category: underweight");
            } else if (bmi >= 18.50f && bmi <= 22.99f) {
                System.out.println("Category: normal, low range");
            } else if (bmi >= 23.00f && bmi <= 24.99f) {
                System.out.println("Category: normal, high range");
            } else if (bmi >= 25.00f && bmi <= 27.49f) {
                System.out.println("Category: overweight, low range");
            } else if (bmi >= 27.50f && bmi <= 29.99f) {
                System.out.println("Category: overweight, high range");
            } else if (bmi >= 30.0f && bmi <= 34.9f) {
                System.out.println("Category: 1st degree obesity");
            } else if (bmi >= 35.0f && bmi <= 39.9f) {
                System.out.println("Category: 2nd degree obesity");
            } else { // bmi >= 40
                System.out.println("Category: 3rd degree obesity");
            }

            sc.close();
        }
    }
}

