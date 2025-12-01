package lab_class_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.in;

public class task6 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(in);
       int inputNum = getBankAcc(input);
        //   System.out.println(inputNum);
        URL text = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(text.openStream()));
            String line;
            while ((line = br.readLine()) != null) {
                String[] splited = line.split("\t");
                String bankAccount = splited[0].trim();
                String firstThreeDigits = bankAccount.substring(0, 3).trim();
                String bankName = splited[1].trim();
                String castedInput = Integer.toString(inputNum);
                if(firstThreeDigits.equals(castedInput)) {
                    System.out.println("Bank  Account : " + bankAccount);
                    System.out.println("Bank Name: "  + bankName);
                }
            }
        }catch (IOException e){
            System.out.println("Error");
        }
    }
    public static int getBankAcc(Scanner input) {
        System.out.println("Pls enter first three digits of the bank account: ");
        int inputNum = 0;
        while (true) {
            inputNum = input.nextInt();
            if (inputNum >= 100 && inputNum <= 999) {
                break;
            }
            System.out.println("Invalid input! Enter only three digits (100-999).");
        }
        return inputNum;
    }

}
