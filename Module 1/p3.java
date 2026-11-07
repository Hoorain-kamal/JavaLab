
/* To write a Java program to check for vowel or consonant.
Program: */

import java.util.Scanner;

class Vowels {
    public static void main(String[] args) {

        boolean isvowel = false;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                isvowel = true;
                break;
        }

        if (isvowel == true) {
            System.out.println(ch + " is a vowel");
        }
        else {
            if ((ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z')) {

                System.out.println(ch + " is a Consonant");
            }
            else {
                System.out.println("Input is not a alphabet");
            }
        }

        sc.close();
    }
}

