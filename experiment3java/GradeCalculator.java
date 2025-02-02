import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        int totalMarks = 0;

        System.out.println("Enter marks for 5 subjects (0-100):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            int mark = scanner.nextInt();

            if (mark < 0 || mark > 100) {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
                return;
            }

            marks[i] = mark;
            totalMarks += mark;
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Grade: " + calculateGrade(totalMarks));
    }

    public static String calculateGrade(int totalMarks) {
        if (totalMarks >= 400 && totalMarks <= 500) {
            return "O";
        } else if (totalMarks >= 300 && totalMarks < 400) {
            return "E";
        } else if (totalMarks >= 250 && totalMarks < 300) {
            return "A";
        } else if (totalMarks >= 200 && totalMarks < 250) {
            return "B";
        } else if (totalMarks >= 0 && totalMarks < 200) {
            return "F";
        } else {
            return "Invalid Total Marks";
        }
    }
}
