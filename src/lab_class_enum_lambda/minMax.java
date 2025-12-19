package lab_class_enum_lambda;

import java.util.Arrays;
import java.util.Random;

public class minMax {
    public static void main(String[] args) {


        int[] numbers = new Random()
        .ints(10, 1, 101)
                .toArray();


        System.out.println("Array elements:");
        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));


        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();


        System.out.println("\n\nMinimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
