import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Input: Take marks obtained (out of 100) in each subject
        try (Scanner sc = new Scanner(System.in)) {
            // Input: Take marks obtained (out of 100) in each subject
            System.out.println("Enter the number of subjects:");
            int numberOfSubjects = sc.nextInt();
            
            int[] marks = new int[numberOfSubjects];
            System.out.println("Enter the marks for each subject out of 100:");
            for (int i = 0; i < numberOfSubjects; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
            }
            // Calculate Total Marks
            int totalMarks = 0;
            for (int mark : marks) {
                totalMarks += mark;
            }
            
            // Calculate Average Percentage
            double averagePercentage = (double) totalMarks / numberOfSubjects;
            
            // Grade Calculation
            char grade;
            if (averagePercentage >=81) {
                grade = 'A';
            } else if (averagePercentage >=61) {
                grade = 'B';
            } else if (averagePercentage >=41) {
                grade = 'c';
            } else if (averagePercentage >=31) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            
            // Display Results
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);
        }
    }
}
