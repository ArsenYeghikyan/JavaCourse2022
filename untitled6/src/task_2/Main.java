package task_2;

public class Main {
    public static void main(String[] args) {
        char[] array = CountOFChars.charsArrayMaker(6);
        int countOfSameCharacters = CountOFChars.characterCounter(array, 'd');
        System.out.println(countOfSameCharacters);
    }
}
