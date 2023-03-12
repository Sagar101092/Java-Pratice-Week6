package javaprogramweek6;

import java.util.Scanner;

/**
 * 9. Write a program to convert the upper case to lower case.
 */
public class UpperCaseToLowerCase {
    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Word/Sentence in upper case : ");
        String s = sc.nextLine();
        myMethod(s);// calling static method
        sc.close();

    }

    // define static method
    public static void myMethod(String value) {
        String s1 = new String(value);
        System.out.println("Your lower case result is :- " + s1.toLowerCase());

    }
}
