package lab_class_6;
public class Task_2 {

    public static void main(String[] args) {

        int[] arr = {10,9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.print("Before: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();


        int minIndex = 0;



        for (int j = 0; j < arr.length; j++) {
            minIndex = j;
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }// inner loop
            int temp = arr[minIndex];
            arr[minIndex] = arr[j];
            arr[j] = temp;

        }

        System.out.print("After: ");
        for(int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Min Value is on index " + minIndex);
    }



}
