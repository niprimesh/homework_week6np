package homewrok_week6;

import java.util.Scanner;

public class Programme_13_Average {
    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);//input 1
            System.out.print("Enter the first number: ");
            double num1 = scan.nextDouble();
            System.out.print("Enter the second number: ");// input 2
            double num2 = scan.nextDouble();
            System.out.print("Enter the third number: ");//input 3
            double num3 = scan.nextDouble();
            scan.close();
            System.out.print("The average of entered numbers is:" + (num1/3+num2/3+num3/3) );

        }


}
