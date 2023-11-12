package homewrok_week6;

import java.util.Scanner;

public class Programme_14_RectangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//scanner call in

        System.out.print("Input  length: ");//input 1
        float num1 = scanner.nextFloat();

        System.out.print("Input height: ");//input 2
        float num2 = scanner.nextFloat();

        float num3 = (num1 * num2);
        float num4 = (num1 * 2 + num2 * 2);
        System.out.println("Expected Output:");
        System.out.println("area of Rectangle :" + num3);
        System.out.println("perimeter of Rectangle :" + num4);
        scanner.close();// scanner close

    }
}
