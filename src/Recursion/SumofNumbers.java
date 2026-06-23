package Recursion;


import java.util.Scanner;

// Problem statement: Given a number ‘N’, find out the sum of the first N natural numbers.

public class SumofNumbers {

    static int sum(int n){
        int res =0;

        if(n == 0)
            return 0;

        return n+sum(n-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int result = sum(num);
        System.out.println("The sum is: "+ result);

    }
}
