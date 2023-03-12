package javaprogramweek6;

import java.util.Scanner;

/**
 * 7. Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius
 */
public class FahrenheitToCelsius {
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit:");
        float f = sc.nextFloat();
        celsius(f);// Calling Static method
        sc.close();
    }

    //Defining Static method
    public static void celsius(float f) {
        float ans = ((f - 32) * 5) / 9;
        System.out.println("Temperature in celsius is:" + ans);
    }
}
