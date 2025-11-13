package lab_class_5;

import java.util.Scanner;

public class Task_4_ConcataningStrings {
    public static void main(String[] args) {
        System.out.print("Provide First String: ");
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        System.out.print("Provide Second String: ");
        String str2 = input.nextLine();

        String firstAndSecond = str1.concat(str2);
        String secondAndFirst = str2.concat(str1);

        System.out.println();
        System.out.println(firstAndSecond);
        System.out.println(secondAndFirst);

        if(firstAndSecond.equals(secondAndFirst)){
            System.out.println("Strings are the same");
        }else{
            System.out.println("Strings are not the same");
        }
    }
}
