package basic;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " " +"is Even Number");
        } else {
            System.out.println(number +" " +"is Odd Number");
        }

    }
}
