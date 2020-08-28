package task_4;

import java.util.Scanner;

public class WordsCountRead {
/*
Read a sentence from console (use scanner.nextLine()). Write a function to count all words in a string. Print the count.
 */
    public static void sentenceReader() {
        System.out.println("Input sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int count = 0;

        if (sentence.length() != 0) {
            count++;
        }

        for (int i = 0; i < sentence.length(); i++) {

            if (String.valueOf(sentence.charAt(i)).equals(" ")) {

                count++;
            }

        }
        System.out.println("sentence: " + count + " ");
    }


}
