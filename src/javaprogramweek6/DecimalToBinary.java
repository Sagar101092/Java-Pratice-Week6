package javaprogramweek6;

import java.util.Scanner;

/**
 * 17. Write a Java program to convert a decimal number to binary number.
 */
public class DecimalToBinary {
    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any decimal Number :");
        int num1 = sc.nextInt();
        myMethod(num1);// Calling Static method
        sc.close();
    }

    // Defining static method
    public static void myMethod(int dec) {
        String bin = Integer.toBinaryString(dec);
        System.out.println("Binary number is: " + bin);
    }
}
