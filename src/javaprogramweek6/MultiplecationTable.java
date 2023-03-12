package javaprogramweek6;

import java.util.Scanner;

/**
 * 10. Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 */
public class MultiplecationTable {
    //Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        myMethod(num); // Calling Static method
        sc.close();
    }

    // Defining Static method
    public static void myMethod(int a) {
        String s = String.valueOf(a);
        System.out.println(s + " x" + " 1 = " + a * 1);
        System.out.println(s + " x" + " 2 = " + a * 2);
        System.out.println(s + " x" + " 3 = " + a * 3);
        System.out.println(s + " x" + " 4 = " + a * 4);
        System.out.println(s + " x" + " 5 = " + a * 5);
        System.out.println(s + " x" + " 6 = " + a * 6);
        System.out.println(s + " x" + " 7 = " + a * 7);
        System.out.println(s + " x" + " 8 = " + a * 8);
        System.out.println(s + " x" + " 9 = " + a * 9);
        System.out.println(s + " x" + " 10 = " + a * 10);


    }
}
