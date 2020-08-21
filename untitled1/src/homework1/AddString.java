package homework1;

import java.util.ArrayList;
import java.util.Scanner;

public class AddString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        boolean isEnd = true;

        while (isEnd) {

            String s = scanner.nextLine();

            if (!s.equals("end")) {

                list.add(s);
                System.out.println(list);
            } else {
                list.remove("end");
                System.out.println(list);
                isEnd = false;
            }

        }
    }
}
