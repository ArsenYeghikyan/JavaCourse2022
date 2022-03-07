package Beginner.OOP.hw4;

public class Computer {

    private final String number;
    private final int RAM;
    private final int hard;


    public Computer(String number, int RAM, int hard) {
        this.hard = hard;
        this.number = number;
        this.RAM = RAM;

    }


    public void printInfo() {

        System.out.println("Computer number: " + " " + number + '\n' + "RAM: " + RAM + '\n' + "Hard: " + hard + '\n');

    }


}
