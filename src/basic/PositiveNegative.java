package basic;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if (num > 0) {
            System.out.println(num + " " + "is positive number");
        } else if (num < 0) {
            System.out.println(num + " " + "is negative number");
        } else {
            System.out.println("The value is 0");
        }
    }
}
