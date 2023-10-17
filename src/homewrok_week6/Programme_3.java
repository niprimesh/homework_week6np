package homewrok_week6;

/**
 * 1 Declare one instance and one static variable.
 * 2 Declare one instance method.
 * 3 Declare one static method.
 * 4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 5 Declare the Main method.
 * 6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme_3 {
    int x = 47; // instance variable
    static String name = "Nimesh"; //Static variable

    // static method
    public static void m1() {
        Programme_3 obj = new Programme_3();
        System.out.println(obj.x);
        System.out.println(name);
    }

    //instant method
    public void m2() {
        System.out.println(x);
        System.out.println(Programme_3.name);
    }

    //main method
    public static void main(String[] args) {
        m1();
        Programme_3 obj = new Programme_3();
        obj.m2();
    }
}
