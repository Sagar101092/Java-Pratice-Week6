package javaprogramweek6;

import java.util.Scanner;

/**
 * 14. Write a Java program to print the area and perimeter of a rectangle.
 */
public class AreaAndPrimeter {
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width : ");
        double wd = sc.nextDouble();
        System.out.println("Enter Height : ");
        double hg = sc.nextDouble();
        AreaAndPrimeter obj = new AreaAndPrimeter();
        obj.areaPremeter(wd, hg);//Calling Instance Method
        sc.close();
    }

    // Defining Instance method
    public void areaPremeter(double a, double b) {
        double area = a * b;
        double perimeter = 2 * (a + b);
        String s = String.valueOf(a);
        String s1 = String.valueOf(b);
        System.out.println("Area is " + s + " * " + s1 + " = " + area);
        System.out.println("Perimeter is 2 *(" + s + " + " + s1 + ") = " + perimeter);
    }
}
