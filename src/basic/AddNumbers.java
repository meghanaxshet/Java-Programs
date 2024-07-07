package basic;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        int num1;
        int num2;
        int sum;
        System.out.print("Enter first number : ");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        num2 = scanner.nextInt();
        sum = num1 + num2;
        System.out.println("Sum of two numbers is : " + sum);
    }
}
