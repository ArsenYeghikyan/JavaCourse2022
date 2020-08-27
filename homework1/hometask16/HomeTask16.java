package homework1.hometask16;

import java.util.Scanner;

public class HomeTask16 {
    /**
     * Գրել հաշվիչ ծրագիր, որը կառաջարկի մուտքագրել 2 թիվ և 1 մաթեմատիկական գործողություն և կտպի արդյունքը էկրանին․
     * Թվերը կարող են լինել int,double,float
     */
    public static void main(String[] args) {
        calc();
    }

    public static void calc() {
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter one of the arithmetic Operators +,-,*,/,% :");
        char symbol = scanner.next().charAt(0);
        System.out.println("Enter number 2: ");
        int number2 = scanner.nextInt();
        switch (symbol) {
            case '+':
                result = number1 + number2;
                System.out.println("result: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("result: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("result: " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println("result: " + result);
                break;
            case '%':
                result = number1 % number2;
                System.out.println("result: " + result);
                break;
            default:
                System.out.println("Enter parameters again");
                calc();

        }
    }
}