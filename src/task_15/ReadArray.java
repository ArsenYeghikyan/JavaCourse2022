package task_15;

public class ReadArray {
    public static void main(String[] args) {
        printInfo();
    }

    public static int[] arrayReader() {

//        Scanner scanner = new Scanner(System.in);
        long inputArray = 123456;
//        scanner.close();
        String integerConverterToString = Long.toString(inputArray);
        int[] arrayFromNumber = new int[integerConverterToString.length()];

        for (int i = 0; i < integerConverterToString.length() - 1; i++) {
            arrayFromNumber[i] = Integer.parseInt(String.valueOf(integerConverterToString.charAt(i)));

        }

        return arrayFromNumber;

    }

    public static void printInfo() {

        int start = arrayReader()[0];

        for (int i = 1; i < arrayReader().length; i++) {

            if (arrayReader()[i] <= arrayReader()[i - 1]) {
                System.out.println("isIncreasing ");
                break;

            } else if (arrayReader()[i] >= arrayReader()[i - 1]) {
                System.out.println("isDecreasing ");
                break;

            } else {
                System.out.println("Neither increasing or decreasing order");
                break;
            }
        }

        }
}
