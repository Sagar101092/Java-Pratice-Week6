package javaprogramweek6;

/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class InstanceVariableInstanceMethod {
    // Declare instance variables
    int a = 10;
    int b = 20;

    // Declare our main method
    public static void main(String[] args) {
        InstanceVariableInstanceMethod obj = new InstanceVariableInstanceMethod();
        obj.myMethod();// calling instance method in main method
    }

    // Declare instance Method
    public void myMethod() {
        System.out.println("Instance method");
        // Calling instance variable into method
        System.out.println(a);
        System.out.println(b);
    }
}
