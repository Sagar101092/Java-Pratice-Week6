package javaprogramweek6;

public class InstanceVariableStaticVariable {
    /**
     * 3.1 Declare one instance and one static variable.
     * 3.2 Declare one instance method.
     * 3.3 Declare one static method.
     * 3.4 Call both instance and static variables into both instance and static methods inside the
     * print statement.
     * 3.5 Declare the Main method.
     * 3.6 Call both instance and static methods into the Main method and run the programme.
     */

    // Declare one static variable one instance variable
    static int a = 10;
    int b = 5;

    // Declare main method
    public static void main(String[] args) {
        InstanceVariableStaticVariable obj = new InstanceVariableStaticVariable();
        obj.myMethod();// Calling instance method
        myMethod2();// Calling static method
    }

    //Declare instance method
    public void myMethod() {
        System.out.println("Instance method");
        InstanceVariableStaticVariable obj = new InstanceVariableStaticVariable();
        System.out.println(obj.a);// calling static variable
        System.out.println(b);//Calling instance variable
    }

    //Declare Static method
    public static void myMethod2() {
        System.out.println("Static method");
        InstanceVariableStaticVariable obj = new InstanceVariableStaticVariable();
        System.out.println(a);// calling static variable
        System.out.println(obj.b);//Calling instance variable
    }
}
