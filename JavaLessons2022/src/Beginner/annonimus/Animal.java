package Beginner.annonimus;

interface Animal{

    void eat();
    void sit();

}

class Main {
    public static void main(String[] args) {

        Animal animalTwo = new Animal() {

            @Override
            public void eat() {

                System.out.println("Animal Two is eating...");

            }

            @Override
            public void sit() {
                System.out.println("Animal is siting");
            }

        };
        animalTwo.eat();
        animalTwo.sit();
    }


}








