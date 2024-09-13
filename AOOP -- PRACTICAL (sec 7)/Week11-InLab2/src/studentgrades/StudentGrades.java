package studentgrades;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    private Map<Integer, Double> gradesMap;

    public StudentGrades() {
        gradesMap = new HashMap<>();
    }

    // Method to add or update a student's grade
    public void addGrade(int studentId, double grade) {
        gradesMap.put(studentId, grade);
    }

    // Method to retrieve a student's grade
    public Double getGrade(int studentId) {
        return gradesMap.get(studentId);
    }

    // Method to list all student grades
    public void listAllGrades() {
        for (Map.Entry<Integer, Double> entry : gradesMap.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
    }
}
