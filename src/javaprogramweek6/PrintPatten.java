package javaprogramweek6;

/**
 * 11. Write a Java program to display the following pattern.
 * Sample Pattern :
 */
public class PrintPatten {
    // Main method
    public static void main(String[] args) {

        patten(); // calling static method
    }

    // Define static method
    public static void patten() {
        System.out.println("J a v v a");
        System.out.println("J a a v v a a");
        System.out.println("J J aaaaa V V aaaaa");
        System.out.println("J J a a V a a");
    }
}
