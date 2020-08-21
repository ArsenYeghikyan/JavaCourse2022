package homework1;

import java.util.ArrayList;
import java.util.Scanner;

public class DoubleValues {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(doubleValue());

        }
    }

    public static ArrayList<String> doubleValue() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            list.add(word);
        }

        return list;
    }

}
