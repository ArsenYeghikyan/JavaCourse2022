package homework1.hometask4;

import java.util.Scanner;

public class HomeTask4 {
    /**
     * 4.  Գրել ծրագիր, որը կառաջարկի մուտքագրել բնական թիվ և կտպի էկրանին այդ թվի բազմապատկման աղուսյակը
     * Օրինակ. 9 - ի դեպքում
     * 1 x 1 = 1
     * 1 x 2 = 2
     * ...
     * 1 x 9 = 9
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer from 1 to 9: ");
        int number = scanner.nextInt();
        int result;
        for (int i = 1; i <= 10; i++) {

            result = i * number;

            System.out.println(i + " * " +  number + " = " + result);

        }
    }
}
