package DSA;

// Problem Statement: Given an integer N, return true if it is a palindrome else return false.

import java.util.Scanner;

public class palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int original = num; // stores the original number

        int lastdigit; // stores last digit at each iteration
        int answer = 0; // store digit in reverse order
        while(num > 0){
           lastdigit = num % 10;
           answer = answer * 10 + lastdigit;
           num = num / 10;
        }

        if(original == answer){
            System.out.println("The number is palindrome");
        }
        else {
            System.out.println("The number is not palindrome");
        }
    }
}
