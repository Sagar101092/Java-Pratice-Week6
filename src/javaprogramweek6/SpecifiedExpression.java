package javaprogramweek6;

/**
 * 12. Write a Java program to compute the specified expressions and print the
 * output.
 */
public class SpecifiedExpression {
    // Main method
    public static void main(String[] args) {

        expression();// calling static method
    }

    // define static method
    public static void expression() {

        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }
}
