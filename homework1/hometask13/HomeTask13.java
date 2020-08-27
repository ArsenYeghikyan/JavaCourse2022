package homework1.hometask13;

import java.util.Scanner;

public class HomeTask13 {
    /**
     * 13.  Given symbol. Print symbol with upper case, if it's lowerCase and print symbol with lower case if it's upper case(use code pointer)
     * ex. 'v' print 'V' or 'V' print 'v'
     */
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String lowerCase = "";
        String upperCase = "";
        System.out.println("Enter Symbol: ");
        String s = scanner1.nextLine();

        if (Character.isUpperCase(s.charAt(0))) {
            lowerCase = s.toLowerCase();
            System.out.println("lowerCase " + lowerCase);
        } else {
            upperCase = s.toUpperCase();
            System.out.println("upperCase " + upperCase);
        }
/////////////// program for String////////////////////////////////

//        Scanner scanner = new Scanner(System.in);
//        String lowerCase="";
//        String upperCase="";
//
//        System.out.println("Enter string: ");
//        String s = scanner.nextLine();
//        for (int i = 0; i < s.length(); i++) {
//            if (Character.isUpperCase(s.charAt(i))) {
//
//                lowerCase = s.toLowerCase();
//            } else {
//                upperCase = s.toUpperCase();
//            }
//        }
//        System.out.println( "lowerCase "+ lowerCase);
//        System.out.println( "upperCase "+ upperCase);
//




    }
}
