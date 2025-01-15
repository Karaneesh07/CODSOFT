import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = num.nextInt();

        int[] marks = new int[numOfSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = num.nextInt();
            totalMarks += marks[i];
        }

        float average = (float) totalMarks / numOfSubjects;

        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("--- Result ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);

        num.close();
    }
}
