package homewrok_week6;

/**
 * 1 Declare two instance variables.
 * 2 Declare one instance method.
 * 3 Call both instance variables into the instance method inside the print statement.
 * 4 Declare the Main method.
 * 5 Call the above instance method into the Main method and Run the programme.
 */

public class Programme_1 {
    //instance variable
    int a = 10;
    int b = 20;

    //instant method
    public void m1() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(b);
    }
    //main method
    public static void main(String[] args) {
        Programme_1 obj = new Programme_1();
        obj.m1();
    }
}
