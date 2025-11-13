package lab_class_5;

public class Task_1_FillingArray {
    public static void main(String[] args) {
        int[] newArray = new int[10];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = 9 - i;
        }
        for(int array : newArray){
            System.out.print(array + " ");
        }
    }

}
