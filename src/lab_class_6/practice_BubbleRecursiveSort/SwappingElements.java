package lab_class_6.practice_BubbleRecursiveSort;

public class SwappingElements {
    public static void main(String[] args) {
      int n = 5, m = 3;
      //swapElements(n, m);
        int[] arr = {3,21, 23};
        swapArray(arr);

    }

    //************************Simple************************************
    public static void swapElements(int num1, int num2){
        int temp;
        temp = num1;
        num1 = num2;
        System.out.println(num1 + " " + num2);
    }
    //********************With array*************************
    public static void swapArray(int arr1[]){
        int temp;

        for (int i = 0; i < arr1.length; i++) {
            temp = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = temp;
        }
        for(int i:arr1){
            System.out.print(i + " ");
        }

    }

}
