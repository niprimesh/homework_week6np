package homewrok_week6;

import java.util.Scanner;

public class Programme_16_AddBinaryNo {

    public static void main(String[] args) {
        System.out.println("Welcome to Java program to add two binary numbers");
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter first binary number");
        String first = scnr.nextLine();
        System.out.println("Please enter second binary number");
        String second = scnr.nextLine();
        String addition = (first + second);
        System.out.println("addition of two binary number is : " + addition);
        scnr.close();
    }
    public static String add(String first, String second) {
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);

    }
    }
