package am.yerevan.java.lessons2020.iterator;

import am.yerevan.java.lessons2020.iterator.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
//        Collection<Integer> integerCollection = new ArrayList<>();
//        integerCollection.add(2);
//        integerCollection.add(3);
//        integerCollection.add(4);
//        integerCollection.add(5);
//        integerCollection.add(8);
//        integerCollection.add(23);
//        integerCollection.add(12);
//        for (Integer integer : integerCollection) {
//            System.out.println(integer);
//        }
//        ArrayList<Animal> animals = new ArrayList<>();
//        animals.add(new Animal("Dog",2000));
//        animals.add(new Animal("Cat",3000));
//
//        Iterator<Animal> iterator = animals.iterator();
//        while (iterator.hasNext()){
//            Animal tmp = iterator.next();
//            tmp.price+=1000;
//        }
//        System.out.println(animals);
//int[] arr = {2,6,4,7,3,5,8,9,1};
//        Arrays.sort(arr);
//        for (int x:arr
//             ) {
//            System.out.println(x);
//        }

        Animal cat = new Animal("Cat3", 1353, 15, 233);
        Animal dog = new Animal("Cat2", 1351, 35, 122);
        Animal bird = new Animal("Cat1", 1352, 55, 200);

        Animal[] animals = {cat, dog, bird};

        Arrays.sort(animals, new ComparatorByPrice());

        for (Animal x : animals) {
            System.out.println(x);
        }

        System.out.println("-----------------------------------------------");

        Arrays.sort(animals, new ComparatorByBreed());
        for (Animal x : animals) {
            System.out.println(x);
        }
        System.out.println("-----------------------------------------------");

        Arrays.sort(animals, new ComparatorBySpeed());
        for (Animal x : animals) {
            System.out.println(x);
        }
    }
}