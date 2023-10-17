package homewrok_week6;

import java.util.Scanner;

public class Programme_6_CircleRadius {
    public static void main(String[] args) {

        double pi = 3.142;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r = input.nextDouble();
        double area = (pi * r * r);
        System.out.println("Area of Circle is: " + area);
        input.close();
    }
}


