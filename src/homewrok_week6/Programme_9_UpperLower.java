package homewrok_week6;

import java.util.Scanner;

public class Programme_9_UpperLower {
    public static void main(String[] args) {
        System.out.println("Please write your name IN CAPITAL:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String lowercase = input.toLowerCase();
        System.out.println("Input : " +input);
        System.out.println("Output :"+lowercase);
        scanner.close();

    }
}
