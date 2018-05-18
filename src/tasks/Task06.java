package tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first triangle side");
        double firstSide = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter second triangle side");
        double secondSide = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter third triangle side");
        double thirdSide = Double.parseDouble(scanner.nextLine());

        isRectangle(firstSide, secondSide, thirdSide);

        scanner.close();
    }

    public static void isRectangle (double a, double b, double c) {
        if (a != 0 || b != 0 || c != 0) {
            if (a*a + b*b == c*c) {
                System.out.println("Rectangle exists");
            } else if (a*a + c*c == b*b) {
                System.out.println("Rectangle exists");
            } else if (b*b + c*c == a*a) {
                System.out.println("Rectangle exists");
            } else {
                System.out.println("Rectangle does not exists");
            }
        } else {
            System.out.println("Rectangle does not exists");
        }
    }
}
