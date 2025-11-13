package lab_class_3;

import java.util.Scanner;

public class Task1Calculator {
    public static void main(String[] args) {
        // we need to import scanner library
        Scanner input = new Scanner(System.in);

        //asking for a number
        System.out.println("Pls Enter a new number: ");
        float firstNumber = input.nextFloat();

        System.out.println("Pls Enter a new number: ");
        float secondNumber = input.nextFloat();

        // Calculations of given numbers
        float sum, difference, product;
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        product = firstNumber * secondNumber;

        // showing results of calculations
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);

        // calculating quotient with if because if devisior number == 0 then it means almost nothing

        if(secondNumber == 0.0f){
            System.out.println("Quotient is undefined. /n PLS Start again):");
        }else {
                float quotient = firstNumber / secondNumber;
                System.out.println("The quotient is: " + quotient);
        }
        input.close();
    }
}
