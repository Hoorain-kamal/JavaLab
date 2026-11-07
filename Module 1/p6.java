
/* To write a Java program to find square root
of a number without using in-built function.*/

import java.util.Scanner;

class SquareRoot {

    public static double computeSqrt(int number) {

        double temp;
        double sr = number / 2.0;

        if (number == 0) {
            return 0;
        }

        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        }
        while (Math.abs(temp - sr) > 0.000001);

        return sr;
    }

    public static void main(String[] args) {

        System.out.print("Enter a positive number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Square root of " + num +
                           " is " + computeSqrt(num));

        sc.close();
    }
}
