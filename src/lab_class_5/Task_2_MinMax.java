package lab_class_5;

import java.util.Random;

public class Task_2_MinMax {
    public static void main(String[] args) {
        int[] newArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(100) + 1;
        }
        for(int num : newArray){
            System.out.print(num + " ");
        }

        System.out.println();

        int min = newArray[0];
        int max = newArray[0];

        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i] < min) {
                min = newArray[i];
            }
            if (newArray[i] > max) {
                max = newArray[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

}
