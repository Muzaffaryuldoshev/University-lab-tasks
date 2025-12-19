package lab_class_12.task_1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class task_1 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("employee.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                employees.add(line);
                    }
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + e.getMessage());
            return;
                }

                System.out.println("Number of employees: " + employees.size());

                for (int i = 0; i < employees.size(); i++) {
                    System.out.println(employees.get(i));
                }

                for (String employee : employees) {
                    System.out.println(employee);
                }

                Iterator<String> iterator = employees.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
        }
    }
}




