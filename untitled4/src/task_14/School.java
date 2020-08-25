package task_14;

import java.util.Scanner;
/*
14. A school has following rules for grading system:
a. 0 to 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. 80 to 100 - A
Ask user to enter a mark and print the corresponding letter.
Sample Input:
67:
Expected Output:
B

 */
public class School {

    public static void printMark() {
        System.out.println("Expected Output:\n"+toGrade());
    }


    private static String toGrade() {

        System.out.println("Input mark: ");

        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();

        if (mark >= 0 && mark <= 25) {
            return "F";
        } else if (mark > 25 && mark <= 45) {
            return "E";
        } else if (mark > 45 && mark <= 50) {
            return "D";
        } else if (mark > 50 && mark <= 60) {
            return "C";
        } else if (mark > 60 && mark <= 80) {
            return "B";
        } else if (mark > 80 && mark <= 100) {
            return "B";
        }
        return "max mark 100";


    }


}
