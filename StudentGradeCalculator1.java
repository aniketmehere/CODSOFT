
import java.util.Scanner; // import the scanner class for taking user input.

public class StudentGradeCalculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Use scanner class

        System.out.print("Enter the total number of subjects: ");
        int numberOfSubjects = sc.nextInt(); // store the total number of subjects

        // Create an array to store subject names in subjectNames object of array
        String[] subjectNames = new String[numberOfSubjects];

        // Input subject names
        for (int i = 0; i < numberOfSubjects; i++) { // in for loop initially i=0, and i is less then the
                                                     // numberOfSubjects
            System.out.print("Enter the name of subject " + (i + 1) + ": "); // (i+1) when user enter the number of
                                                                             // subjects that works as per the user
                                                                             // input
            subjectNames[i] = sc.next(); // and that subjectNames are stored into the array.
        }

        int totalMarks = 0; // initially totalmarks =0.

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks obtained in " + subjectNames[i] + " (out of 100): "); // The total number of
                                                                                                // marks obtanined in
                                                                                                // each subject that
                                                                                                // stored into the
                                                                                                // subject name[i]
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double averagePercentageOfMarks = (double) totalMarks / numberOfSubjects;// here we calculate the
                                                                                 // averagePercentageOfMarks by
                                                                                 // numberOfSubjects divide by total
                                                                                 // marks
        char grade = calculateGrade(averagePercentageOfMarks); // and calculatedGrade store into the grade object.

        // System.out.println("\nResult is:" + totalMarks);
        System.out.println("Total Marks are: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentageOfMarks);
        System.out.println("Grade: " + grade);
    }

    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90 && averagePercentage <= 100) { // here we use the else-if ladder....
            return 'A'; // if averagePercentage is betweeen greater than equal to 90 and less than equal
                        // to 100 then Grade will be A
        } else if (averagePercentage >= 80 && averagePercentage < 90) { //
            return 'B'; // if averagePercentage is betweeen greater than equal to 80 and less than equal
                        // to 90 then Grade will be B
        } else if (averagePercentage >= 70 && averagePercentage < 80) { //
            return 'C'; // if averagePercentage is betweeen greater than equal to 70 and less than equal
                        // to 80 then Grade will be C
        } else if (averagePercentage >= 60 && averagePercentage < 70) { //
            return 'D'; // if averagePercentage is betweeen greater than equal to 60 and less than equal
                        // to 70 then Grade will be D
        } else { // else the user will be failed if he dont satisfy the above conditions.
            System.out.println("You are Fail:(...........Give your best next time....Best of Luck!!!");
            return 'F';
        }
    }
}
