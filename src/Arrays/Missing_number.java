package Arrays;

// Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N.
// Find the number(between 1 to N), that is not present in the given array.

import java.util.Scanner;

public class Missing_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of numbers: ");
        int n = sc.nextInt();

        int[] arr = new int[n-1];

        System.out.println("Enter "+(n-1)+" elements: ");
        for(int i =0; i < n-1; i++){
            arr[i] = sc.nextInt();
        }

        int totalsum = n * (n + 1)/2;

        int arraysum =0;
        for(int num : arr){
            arraysum += num;
        }

        int result = totalsum-arraysum;

        System.out.println("The missing number is: "+ result);

    }
}
