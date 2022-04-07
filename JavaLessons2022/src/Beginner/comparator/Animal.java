package Beginner.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Animal implements Comparable<Animal> {

    private int weight = 0;
    private int age = 0;
//    private String name = "";


    public Animal(int weight, int age) {
        this.weight = weight;
        this.age = age;

    }


    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal:" + '\n' +
                "Weight: " + weight + '\n' +
                "Age: " + age + '\n';

    }

    @Override
    public int compareTo(Animal o) {



            return this.weight - o.weight;



    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return weight == animal.weight && age == animal.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, age);
    }
}


class Start3 {
    public static void main(String[] args) {

        Animal animal = new Animal(15, 14);
        Animal animal2 = new Animal(10, 5);
        Animal animal3 = new Animal(40, 8);
        Animal animal4 = new Animal(50, 12);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);

        for (Animal animal1 : animals) {
            System.out.println(animal1);
        }
        System.out.println("-----------------------------------");
        animals.sort(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getWeight()-o2.getWeight();
            }
        });

     animals.forEach(animal1 -> {
         System.out.println(animal.toString());
     });

        animals.sort(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        System.out.println("----------------------------");

        for (Animal animal1 : animals) {
            System.out.println(animal1);
        }

    }





}

