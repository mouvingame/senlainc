package tasks;

import java.util.*;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();
        String[] arraySentence = sentence.toLowerCase().split(", | ");
        int count = 0;
        String sortedWords = "";

        Arrays.sort(arraySentence);

        for (String output : arraySentence) {
            sortedWords = sortedWords.concat(output + " ");
            count++;
        }

        System.out.println("Sorted String: " + sortedWords);
        System.out.println("Сount: " + count);

        scanner.close();
    }
}
