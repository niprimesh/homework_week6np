package homewrok_week6;

/**
 * 1 Declare two static variables
 * 2 Declare one static method
 * 3 Call both static variables into the static method inside the print statement.
 * 4 Declare the Main method.
 * 5 Call the static method into the Main method and Run the programme.
 */

public class Programme_2 {
    //stiatic variables
    static int a = 5;
    static String b = "c";

    //static method
    public static void m2() {
        System.out.println(a);
        System.out.println(b);
    }

    //main method
    public static void main(String[] args) {
        m2();
    }
}
