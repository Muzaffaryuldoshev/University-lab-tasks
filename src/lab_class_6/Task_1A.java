package lab_class_6;

import org.w3c.dom.ls.LSOutput;

public class Task_1A {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("Before: ");
        for(int i:arr){
            System.out.print(i+ " " );
        }

        int actionCount = 0;


        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                actionCount++;
                if (arr[j] > arr[j + 1]) {
                    int tempArr = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempArr;
                }
            }
        }

        System.out.print("After:  ");
        for(int i:arr){
            System.out.print(i+ " " );
        }
        System.out.println("Total actions: " + actionCount);
    }


}