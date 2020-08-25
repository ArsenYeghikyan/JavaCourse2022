package task_17;

import java.util.Scanner;

public class DataBase {
    public static void main(String[] args) {
        printOldestParticipants(2);
    }

    public static void printOldestParticipants(int humanCount) {
        int i = 0;
        while (i < humanCount) {
            System.out.println("hi");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            int age = scanner.nextInt();

            Human[] humans = new Human[humanCount];
            for (int j = 0; j <humans.length ; j++) {
                humans[j] = new Human(name,age);

            }


            i++;
        }

    }


}
