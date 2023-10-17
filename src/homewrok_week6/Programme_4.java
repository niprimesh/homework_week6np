package homewrok_week6;

/**
 * 1 Declare two instance and two static variables.
 * 2 Declare one instance method.
 * 3 Declare one static method.
 * 4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 5 Declare the Main method.
 * 6 Call both instance and static methods into the Main method and run the programme
 */
public class Programme_4 {
    int a = 10;//instance variable
    String name = "nimesh";//instance variable
    static int b = 20;//static variable
    static String surname = "patel";//static variable

    //static method
    public static void x1() {
        Programme_4 obj = new Programme_4();
        System.out.println(obj.a);
        System.out.println(obj.name);
        System.out.println(b);
        System.out.println(surname);
    }

    //instance method
    public void x2() {
        System.out.println(a);
        System.out.println(name);
        System.out.println(Programme_4.b);
        System.out.println(Programme_4.surname);
    }

    //main method
    public static void main(String[] args) {
        Programme_4 call = new Programme_4();
        call.x2();
        x1();

    }
}
