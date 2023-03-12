package javaprogramweek6;

import java.util.Scanner;

/**
 * 16. Write a Java program to add two binary numbers.
 */
public class AddBinaryNumber {
    // Main method declaration
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Binary Number :");
        String num1 = sc.nextLine();//Storing input value
        System.out.println("Enter Second Binary Number :");
        String num2 = sc.nextLine();//Storing input value
        binaryNumber(num1, num2); // Calling static method
        sc.close();
    }

    // Defining Static method
    public static void binaryNumber(String input1, String input2) {
        int number0 = Integer.parseInt(input1, 2);
        int number1 = Integer.parseInt(input2, 2);

        int sum = number0 + number1;
        String ans = Integer.toBinaryString(sum);
        System.out.println("Sum of two binary numbers : " + ans);

    }
}
