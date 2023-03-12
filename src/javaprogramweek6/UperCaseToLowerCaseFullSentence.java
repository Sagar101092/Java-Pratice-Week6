package javaprogramweek6;

import java.util.Scanner;

/**
 * 19. Write a Java program to convert a given string into lowercase.
 */
public class UperCaseToLowerCaseFullSentence {
    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Sentence in upper case : ");
        String s = sc.nextLine();
        myMethod(s); // Calling Static method
        sc.close();

    }

    // define static method
    public static void myMethod(String value) {
        String s1 = new String(value);
        System.out.println("Your lower case result is :- " + s1.toLowerCase());

    }
}
