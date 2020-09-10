package task_17;

import java.util.ArrayList;
import java.util.Scanner;

public class DataBase {


    private static Human createHuman() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("participant name: ");
        String name = scanner.next();
        System.out.println("participant age: ");
        int age = scanner.nextInt();
        Human human = new Human(name, age);
        return human;
    }


    private static ArrayList<Human> humanList() {
        System.out.println("Input participant count: ");
        Scanner scanner = new Scanner(System.in);
        int humanCount = scanner.nextInt();
        int i = 0;
        ArrayList<Human> humans = new ArrayList<>(humanCount);
        while (i < humanCount) {

            humans.add(createHuman());

            i++;
        }

        return humans;

    }


    public static void printOldestParticipant() {
        ArrayList<Human> humans = humanList();
        int oldest = humans.get(0).getYear();
        String oldestName = humans.get(0).getName();
        for (Human human : humans) {
            if (oldest < human.getYear()) {
                oldest = human.getYear();
                oldestName = human.getName();
            }
        }
        System.out.println("Expected output:\n" + oldestName + " is oldest\n age: " + oldest);

    }

    public static void printYoungestParticipant() {
        ArrayList<Human> humans = humanList();
        int youngest = humans.get(0).getYear();
        String youngestName = humans.get(0).getName();
        for (Human human : humans) {
            if (youngest > human.getYear()) {

                youngest = human.getYear();
                youngestName = human.getName();
            }
        }
        System.out.println("Expected output:\n" + youngestName + " is youngest\n age: " + youngest);

    }


}
