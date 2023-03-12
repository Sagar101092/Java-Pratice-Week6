package javaprogramweek6;

import java.util.Scanner;

/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 */
public class MultipleOperationOfTwoNumber {
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int x = sc.nextInt();
        System.out.println("Enter Second number : ");
        int y = sc.nextInt();
        MultipleOperationOfTwoNumber obj = new MultipleOperationOfTwoNumber();
        addition(x, y); //Calling Static method
        subtraction(x, y); //Calling Static method
        obj.multiplication(x, y); // Calling Instance Method
        obj.division(x, y); // Calling Instance Method
        reminder(x, y); //Calling Static method
        sc.close();

    }

    // Create static method
    public static void addition(int a, int b) {
        int ans = a + b;
        String s = String.valueOf(a);
        String s1 = String.valueOf(b);
        System.out.println(s + " + " + s1 + " = " + ans);

    }

    // Create static method
    public static void subtraction(int a, int b) {
        int ans = a - b;
        String s = String.valueOf(a);
        String s1 = String.valueOf(b);
        System.out.println(s + " - " + s1 + " = " + ans);
    }

    //Create Instance Method
    public void multiplication(int a, int b) {
        int ans = a * b;
        String s = String.valueOf(a);
        String s1 = String.valueOf(b);
        System.out.println(s + " x " + s1 + " = " + ans);
    }

    //Create Instance Method
    public void division(int a, int b) {
        int ans = a / b;
        String s = String.valueOf(a);
        String s1 = String.valueOf(b);
        System.out.println(s + " / " + s1 + " = " + ans);
    }

    // Creat static method
    public static void reminder(int a, int b) {
        int ans = a % b;
        String s = String.valueOf(a);
        String s1 = String.valueOf(b);
        System.out.println(s + " mod " + s1 + " = " + ans);
    }

}


