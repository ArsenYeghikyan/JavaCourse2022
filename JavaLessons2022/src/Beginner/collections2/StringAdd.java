package Beginner.collections2;

import java.util.ArrayList;
import java.util.Scanner;

public class StringAdd {


    public static void main(String[] args) {

        addStr();

    }


    public static void addStr() {

        System.out.println("Enter strings, anf end if you want finish the program: ");
        ArrayList<String> strings = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        boolean isStr = true;
        while (isStr) {
            String s = scanner.nextLine();

            if (!("end".equalsIgnoreCase(s) || "e.n.d".equalsIgnoreCase(s) || "e n d".equalsIgnoreCase(s))) {

                strings.add(s);

            } else {
                isStr = false;
            }


        }

        getStr(strings);

    }


    public static void getStr(ArrayList<String> str) {

        str.forEach(System.out::println);

    }


}
