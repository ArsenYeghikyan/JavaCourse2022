package Beginner.OOP.hw4;

public class Main {

    public static void main(String[] args) {

        Computer[] computers = new Computer[4];
        computers[0]  = new Computer("C1111",1000,256);
        computers[1]  = new Computer("C2222",2000,512);
        computers[2]  = new Computer("C3333",4000,1000);
        computers[3]  = new Computer("C4444",8000,2000);

        for (Computer computer : computers) {
            computer.printInfo();
        }

    }


}
