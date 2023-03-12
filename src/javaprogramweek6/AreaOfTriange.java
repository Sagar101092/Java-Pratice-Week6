package javaprogramweek6;

import java.util.Scanner;

/**
 * #
 * 8. Write a program to calculate the area of a triangle.
 */
public class AreaOfTriange {
    //Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of Base : ");
        int x = sc.nextInt();
        System.out.println("Enter value of height : ");
        int y = sc.nextInt();
        AreaOfTriange obj = new AreaOfTriange();
        obj.area(x, y);// Calling Instance Method
        sc.close();
    }

    // define Instance method
    public void area(int a, int b) {
        int ans = (a * b) / 2;
        System.out.println("Area of triangle is : " + ans);

    }
}
