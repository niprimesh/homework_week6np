package homewrok_week6;

import java.util.Scanner;

public class Programme_8_AreaTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Tringle's base length: ");
        double num1 = scanner.nextDouble();

        System.out.print("Input Tringle's height: ");
        double num2 = scanner.nextDouble();

        double num3 = (num1 * num2);
        System.out.println("area of tringle :" + num3);

    }
}