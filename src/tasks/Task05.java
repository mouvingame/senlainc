package tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();
        System.out.println("Enter the word");
        String word = scanner.nextLine().toLowerCase().trim();
        String[] arraySentence = sentence.toLowerCase().split(" ");
        int count = 0;

        for (int i = 0; i < arraySentence.length; i++) {
            if (word.equals(arraySentence[i])) {
                count++;
            }
        }

        System.out.println("Count: " + count);

        scanner.close();
    }
}
