package javaprogramweek6;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */


public class TwoStaticVariableTwoInstanceVariable {
    // Declare two static variable two instance variable
    static int a = 10;
    static int x = 12;
    int b = 5;
    int y = 6;

    // Declare main method
    public static void main(String[] args) {
        TwoStaticVariableTwoInstanceVariable obj = new TwoStaticVariableTwoInstanceVariable();
        obj.myMethod();// Calling instance method
        myMethod2();// Calling static method
    }

    //Declare instance method
    public void myMethod() {
        System.out.println("Instance method");
        TwoStaticVariableTwoInstanceVariable obj = new TwoStaticVariableTwoInstanceVariable();
        System.out.println(obj.a);// calling static variable
        System.out.println(obj.x);//calling static variable
        System.out.println(b);//Calling instance variable
        System.out.println(y);//Calling instance variable
    }

    //Declare Static method
    public static void myMethod2() {
        System.out.println("Static method");
        TwoStaticVariableTwoInstanceVariable obj = new TwoStaticVariableTwoInstanceVariable();
        System.out.println(a);// calling static variable
        System.out.println(x);// calling static variable
        System.out.println(obj.b);//Calling instance variable
        System.out.println(obj.y);//Calling instance variable
    }
}

