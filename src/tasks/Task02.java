package tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 and number 2");

        try {
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            System.out.println(add(number1, number2));
            System.out.println(subtract(number1, number2));
            System.out.println(lcm(number1, number2));
            System.out.println(gcd(number1, number2));
        } catch (InputMismatchException e) {
            System.out.println("Wrong number");
        }

        scanner.close();
    }

    public static int gcd(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }
        return num1 + num2;
    }

    public static int lcm(int num1, int num2) {
        return num1 / gcd(num1, num2) * num2;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
}
