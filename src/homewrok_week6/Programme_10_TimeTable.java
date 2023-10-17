package homewrok_week6;

import java.util.Scanner;

public class Programme_10_TimeTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number :  ");
        int number = scanner.nextInt();
        System.out.println("Multiplication table for " + number + " : ");
        for (int i = 1; i <= 10; i++) {

            System.out.println(number + "  x  " + i + "  =  " + (number * i));
        }
        scanner.close();
    }
}

