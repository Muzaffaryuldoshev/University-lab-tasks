package lab_class_enum_lambda;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentOBJ {
   // String fileName = "\"C:\\Users\\99894\\Desktop\\Downloads\\studentsGroup5.txt\"";
    public static ArrayList<Student> loadStudents(String fileName) {
        ArrayList<Student> students = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(fileName));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                String name = parts[0];
                String surname = parts[1];
                int score = Integer.parseInt(parts[2]);

                students.add(new Student(name, surname, score));
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        return students;
    }

    public static void main(String[] args) {

        // Your file path
        String filePath = "C:\\Users\\99894\\Desktop\\Downloads\\studentsGroup5.txt";

        // Load students
        ArrayList<Student> students = loadStudents(filePath);

        // 1) Students with grade 5
        System.out.println("Students with grade 5:");
        students.stream()
                .filter(s -> s.getScore() == 5)
                .forEach(System.out::println);

        // 2) Average of all grades
        double average = students.stream()
                .mapToInt(student -> (int) student.getScore())
                .average()
                .orElse(0);

        System.out.println("\nAverage score: " + average);

        // 3) Count of students with grade 5
        long count = students.stream()
                .filter(s -> s.getScore() == 5)
                .count();

        System.out.println("Number of students with grade 5: " + count);
    }
}





