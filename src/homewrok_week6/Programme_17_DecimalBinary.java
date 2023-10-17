package homewrok_week6;

import java.util.Scanner;

public class Programme_17_DecimalBinary {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Decimal Number: ");
        int decimalNumber = scanner.nextInt();
        String binarynumber = Integer.toBinaryString(decimalNumber);
        System.out.println("Binary number is: " + binarynumber);
        scanner.close();
    }
}


