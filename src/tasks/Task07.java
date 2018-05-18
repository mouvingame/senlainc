package tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < N; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        for (int i = 0; i < N; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        for (int output : array) {
            System.out.print(output + " ");
        }

        System.out.println();
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);

        scanner.close();
    }
}
