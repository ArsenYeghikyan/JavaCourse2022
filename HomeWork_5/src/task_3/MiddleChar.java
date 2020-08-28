package task_3;

import java.util.Scanner;

/*
3. Read a string from console. Write a function to print the middle character of a string. (use String.charAt(i) method)

 */
public class MiddleChar {
    public static void printMiddleChar(){
        System.out.println("Input word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        System.out.println("middle char:\n"+ word.charAt(word.length()/2));





    }
}
