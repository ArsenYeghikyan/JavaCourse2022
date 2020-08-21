package am.yerevan.java.lessons2020.iterator;

import java.util.Comparator;

public class Animal {
    public String breed;
    public int price;
    public int weight;
    public int speed;


    public Animal(String breed, int price, int weight, int speed) {
        this.breed = breed;
        this.price = price;
        this.weight = weight;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return
                breed + " " + price + " " + weight + " " + speed;

    }


}

class ComparatorByPrice implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.price - o2.price;
    }
}

class ComparatorByBreed implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.breed.compareTo(o2.breed);
    }
}

class ComparatorBySpeed implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.speed - o2.speed;
    }
}
