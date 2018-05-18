package tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        try {
            int number = scanner.nextInt();
            evenOrOdd(number);
            if (isPrime(number)) {
                System.out.println("It's simple number");
            } else {
                if (number > 2) System.out.println("It's complex number");
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong number");
        }

        scanner.close();
    }

    public static void evenOrOdd(int number) {
        if (number % 2 == 0) System.out.println("It's even number");
        else System.out.println("It's odd number");
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
