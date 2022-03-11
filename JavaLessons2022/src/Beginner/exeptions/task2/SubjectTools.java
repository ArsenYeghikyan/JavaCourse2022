package Beginner.exeptions.task2;

import java.util.ArrayList;

import java.util.Comparator;

public class SubjectTools {


    ArrayList<Subject> items = new ArrayList<>();


    public void addItems(Subject subject) {
        if (subject != null) {

            items.add(subject);
        } else {
            System.out.println();
        }
        sortItems();


    }

    private void sortItems() {

        items.sort(Comparator.comparing(Subject::getShopName));

    }


    public void removeSubject(Subject subject) {

        if (items.contains(subject) && subject != null) {
            items.remove(subject);

        } else {
            System.out.println("subject not found");
        }

        if (items.isEmpty()) {
            System.out.println("list is empty");
        }
    }


    public void findSubject(Subject subject) {
        try {


            if (subject != null) {
                for (Subject allItems : items) {


                    if (items.contains(subject)) {
                        System.out.println(allItems);
                    } else {

                        System.out.println("subject not found");
                    }
                }
            } else {
                throw new NullPointerException("empty value!!");
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }


    public void printItemsInfo() {
        try {
            for (Subject allItems : items) {
                if (allItems != null) {
                    System.out.println(allItems);
                } else {
                    throw new NullPointerException("empty value!!");
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }


    }

}
