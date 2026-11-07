
/* To write a Java program to check whether
a given number is palindrome or not.*/

import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {

        int num, reversedInteger = 0, remainder, originalInteger;

        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        originalInteger = num;

        // Reversed integer is stored in variable
        while (num != 0) {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num /= 10;
        }

        // Check palindrome
        if (originalInteger == reversedInteger) {
            System.out.println(originalInteger + " is a palindrome.");
        }
        else {
            System.out.println(originalInteger + " is not a palindrome.");
        }

        sc.close();
    }
}
