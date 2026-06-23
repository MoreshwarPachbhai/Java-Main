package Recursion;

import java.util.Scanner;

public class FactorialOfNumbers {

    static int fact = 1;  // global variable to hold factorial result

    static void factorial(int n) {
        if (n == 0 || n == 1)  // base case
            return;

        fact = fact * n;   // multiply current number
        factorial(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        factorial(x);
        System.out.println("Factorial of " + x + " is: " + fact);
    }
}
