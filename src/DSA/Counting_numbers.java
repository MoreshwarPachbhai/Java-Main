package DSA;

// Problem Statement: Given an integer N, return the number of digits in N.

import java.util.Scanner;

public class Counting_numbers {
    public static void main(String[] args) {
        // Taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int count = 0; // to store number of digits

        if(num == 0){
            count = 1;
        }
        else{
            while(num > 0){
                num = num / 10; // remove last digit
                count++;
            }
        }
        System.out.println("Number of digits are: "+ count);
    }
}
