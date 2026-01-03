package SMS;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        GradeCalculator calculator = new GradeCalculator();
        
        List<Double> grades = new ArrayList<>();
        grades.add(85.5);
        grades.add(90.0);
        
        System.out.println("Student: " + student.getName());
        System.out.println("Average Grade: " + calculator.calculateAverage(grades));
    }
}