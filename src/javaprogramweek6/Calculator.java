package javaprogramweek6;

import java.util.Scanner;

/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.
 */
public class Calculator {


    //Create main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int x = sc.nextInt();
        System.out.println("Enter Second number : ");
        int y = sc.nextInt();
        Calculator obj = new Calculator();
        addition(x, y);      // Calling Static method
        subtraction(x, y);   // Calling Static method
        obj.multiplication(x, y); // Calling Instance method
        obj.division(x, y); // Calling Instance method
        sc.close();

    }

    // Create static method
    public static void addition(int a, int b) {
        int ans = a + b;
        System.out.println("Addition of two numbers is : " + ans);

    }

    // Create static method
    public static void subtraction(int a, int b) {
        int ans = a - b;
        System.out.println("Subtraction of two numbers is : " + ans);
    }

    //Create Instance Method
    public void multiplication(int a, int b) {
        int ans = a * b;
        System.out.println("Multiplication of two numbers is : " + ans);
    }

    //Create Instance Method
    public void division(int a, int b) {
        int ans = a / b;
        System.out.println("Division of two numbers is : " + ans);
    }

}
