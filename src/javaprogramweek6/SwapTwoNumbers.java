package javaprogramweek6;

import java.util.Scanner;

/**
 *15. Write a Java program to swap two variables.
 */
public class SwapTwoNumbers {
    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First value :");
        int num1 = sc.nextInt();
        System.out.println("Enter Second value :");
        int num2 = sc.nextInt();
        swapFunction(num1, num2);// calling static method
        sc.close();
    }

    // define static method
    public static void swapFunction(int x, int y) {

        System.out.println("Original values of x and y");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = x ^ y ^ (y = x);
        System.out.println("Swapped values of x and y");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

}
