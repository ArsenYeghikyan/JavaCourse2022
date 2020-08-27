package homework1.hometask15;

import java.util.Scanner;

public class HomeTask15 {
    /**
     * Ծանրության ուժը Լուսնի վրա հավասար է ~17% -ի; Գրել ծրագիր, որ մուտքագրելով քո քաշը կհաշվի քո քաշը Լուսնի վրա;
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        double humanWeight = scanner.nextDouble();

        double gMoon = 0.165;
        System.out.println(humanWeight*gMoon);

    }
}
