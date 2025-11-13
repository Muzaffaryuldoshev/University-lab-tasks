package lab_class_5;

import java.util.Scanner;

public class Task_5_Palindrom {
    public static void main(String[] args) {
        System.out.print("Provide a String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();

        boolean isPalindrome = true;

        int wordLength = str.length();
        for (int i = 0; i < wordLength; i++) {
            if (str.charAt(i) != str.charAt(wordLength - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
            if (isPalindrome) {
                System.out.println("Palindrome");
            }else {
                System.out.println("Not Palindrome");
            }

    }
}
