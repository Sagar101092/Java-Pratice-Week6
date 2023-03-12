package javaprogramweek6;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class StaticVariableStaticMethod {
    //Declare Static variables
    static int x = 5;
    static int y = 10;

    // declare main method
    public static void main(String[] args) {

        myMethod2(); //Calling static method
    }

    //Declare static method
    public static void myMethod2() {
        System.out.println("Static Method");
        //Calling static variables
        System.out.println(x);
        System.out.println(y);
    }
}
