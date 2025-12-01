package lab_class_10;

import java.io.*;

public class task4 {
    public static void main(String[] args) {

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\99894\\Desktop\\Downloads"));
            FileWriter fw = new FileWriter("C:\\Users\\99894\\Desktop\\Downloads")){

            String line;
            while((line = bufferedReader.readLine()) != null){
                //  System.out.println(line);

                String[] words = line.split("\\s");
                String surname = words[0].trim();
                String name = words[1].trim();
                String score = words[2].trim();
                if(score.equals("5")) {
                    System.out.println("Surname : " + surname + " name: " + name + " score " + score);
                    fw.write(surname + "\s" + name + "\s" +score +"\n");
                }
            }
        } catch (IOException e){
            System.out.println("Error IO");
        }
    }

}
