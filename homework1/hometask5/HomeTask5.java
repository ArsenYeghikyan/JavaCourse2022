package homework1.hometask5;

public class HomeTask5 {
    /**
     Write a program to print this figure

        *
       ***
      ******
     ********
     */
    public static void main(String[] args) {

        for (int i = 1; i <=9; i++) {
            for (int j = i; j >=1; j--) {
                System.out.print(" * ");

            }


            System.out.println();
        }
    }
}
