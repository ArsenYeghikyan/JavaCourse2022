package task_7;

import java.util.Scanner;

public class ConvertFromInchesToMeters {
    final static double ONE_INCHES_IN_METRES = 0.0254;

    public static void main(String[] args) {
        converterFromInchesToMeters();
    }

    public static void converterFromInchesToMeters() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter inches: ");
        double inchesInput = scanner.nextDouble();
        double metresOutput = inchesInput * ONE_INCHES_IN_METRES;
        System.out.println("Expected Output : " + '\n' + inchesInput + " inch is " + metresOutput + " meters");
    }
}
