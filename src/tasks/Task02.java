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
//             System.out.println(lcm(number1, number2));
//             System.out.println(gcd(number1, number2));
            
//          я так понимаю отрицательные не нунжно обрабатывать потому что там нок и нод еще для отрицательных можно искать))
//          я забил на отрицательные
            System.out.println(getNok(number1, number2));
            System.out.println(getNod(number1, number2));
        } catch (InputMismatchException e) {
            System.out.println("Wrong number");
        }

        scanner.close();
    }
    
    public static int getNok(int num1, int num2){
        int bigger = (num1 > num2) ? num1 : num2;
        
        int nok = bigger;
        while (nok >= bigger) {
            if (nok % num1 == 0 && nok % num2 == 0) {
                return nok;
            } else {
                nok++;
            }
        }
        return -1;
    }
    
    public static int getNod(int num1, int num2){
        int smaller = (num1 < num2) ? num1 : num2;
        
        int nod = smaller;
        while (nod <= smaller) {
            if (num1 % nod == 0 && num2 % nod == 0) {
                return nod;
            } else {
                nod--;
            }
        }
        return -1;
    }

//     public static int gcd(int num1, int num2) {
//         while (num1 != 0 && num2 != 0) {
//             if (num1 > num2) {
//                 num1 = num1 % num2;
//             } else {
//                 num2 = num2 % num1;
//             }
//         }
//         return num1 + num2;
//     }

//     public static int lcm(int num1, int num2) {
//         return num1 / gcd(num1, num2) * num2;
//     }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
}
