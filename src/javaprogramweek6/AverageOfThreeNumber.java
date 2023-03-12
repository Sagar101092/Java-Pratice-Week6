package javaprogramweek6;

import java.util.Scanner;

/**
 * 13. Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class AverageOfThreeNumber {
    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter Third number : ");
        int num3 = sc.nextInt();
        AverageOfThreeNumber avg = new AverageOfThreeNumber();
        avg.average(num1, num2, num3);   //Calling Instance method
        sc.close();

    }

    // Defining Instance method
    public void average(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        System.out.println("Average of the numbers is : " + avg);

    }

}
