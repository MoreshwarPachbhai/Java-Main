package DSA;

// Problem Statement: Given two integers N1 and N2, find their greatest common divisor.

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;

        }

        System.out.println("GCD is: "+ num1);

    }
}
