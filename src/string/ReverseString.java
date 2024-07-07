package string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String originalString;
        String reversedString = " ";
        System.out.print("Enter the String : ");
        Scanner scanner = new Scanner(System.in);
        originalString = scanner.nextLine();
        for (int i = 0; i < originalString.length(); i++) {
            reversedString = originalString.charAt(i) + reversedString;
        }
        System.out.println("Revered String is :" + reversedString);

    }
}
