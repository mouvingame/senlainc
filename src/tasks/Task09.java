package tasks;

/**
 * Нужно ли включать длину последовательноести N <= 100?
 * Длину последовательности принял N < 100.
 */

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            array[i] = i;
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }

        System.out.println("Sum of even numbers: " + sum);

        scanner.close();
    }
}
