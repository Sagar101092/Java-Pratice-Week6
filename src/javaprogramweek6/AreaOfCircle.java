package javaprogramweek6;

import java.util.Scanner;

/**
 * 6. Write a program to enter any radius value of the circle and find out the
 * area.
 */
public class AreaOfCircle {
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r = sc.nextDouble();
        circle(r);// Calling Static method
        sc.close();
    }

    // Defining static method
    public static void circle(Double r) {
        double area = (22 * r * r) / 7;
        System.out.println("Area of Circle is: " + area);
    }
}
