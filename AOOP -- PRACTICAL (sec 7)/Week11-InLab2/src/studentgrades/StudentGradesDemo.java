package studentgrades;

public class StudentGradesDemo {
    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();

        // Adding student grades
        studentGrades.addGrade(101, 85.5); // Student ID: 101, Grade: 85.5
        studentGrades.addGrade(102, 92.0); // Student ID: 102, Grade: 92.0
        studentGrades.addGrade(103, 78.4); // Student ID: 103, Grade: 78.4
        studentGrades.addGrade(104, 88.9); // Student ID: 104, Grade: 88.9
        studentGrades.addGrade(105, 91.2); // Student ID: 105, Grade: 91.2
        studentGrades.addGrade(106, 79.3); // Student ID: 106, Grade: 79.3

        // Retrieve and display a student's grade
        System.out.println("Grade for student ID 102: " + studentGrades.getGrade(102));

        // List all student grades
        System.out.println("All student grades:");
        studentGrades.listAllGrades();
    }
}
