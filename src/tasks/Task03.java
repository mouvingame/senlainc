package tasks;

/**
 * Без учета регистра
 */

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println("Word is palindrome");
        } else {
            System.out.println("Word isn't palindrome");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String word) {
        StringBuffer reverse = new StringBuffer(word).reverse();
        String stringReverse = reverse.toString();
        if (word.equalsIgnoreCase(stringReverse)) return true;
        else return false;
    }
}
