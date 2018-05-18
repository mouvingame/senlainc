package tasks;

/**
 * Нужно ли включать длину последовательноести N <= 100?
 * Длину последовательности принял N < 100.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        ArrayList<Integer> palindromeList = new ArrayList<Integer>();

        for (int i = 0; (i < N) && (N < 100); i++) {
            array[i] = i;
            if (isPalindrome(String.valueOf(array[i]))) {
                palindromeList.add(array[i]);
            }
        }

        for (int output : palindromeList) {
            System.out.print(output + " ");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String number) {
        StringBuffer reverse = new StringBuffer(number).reverse();
        String stringReverse = reverse.toString();
        if (number.equalsIgnoreCase(stringReverse)) return true;
        else return false;
    }

}
