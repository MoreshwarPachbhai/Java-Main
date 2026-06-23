package DSA;

// Problem Statement: Given an integer N, check whether it is prime or not.
// A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        boolean flag = true;

        if(num <= 1){
            flag = false;
        }
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                }
            }
        }
        if(flag){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Non Prime number");
        }
    }
}
