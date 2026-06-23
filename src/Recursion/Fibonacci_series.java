package Recursion;

// Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.

import java.util.Scanner;

public class Fibonacci_series {

    static void fibonacci(int index){
        int firstnum = 0;
        int secondnum = 1;

        System.out.print("Fibonacci series: ");

        System.out.print(firstnum+" ");
        if(index > 1){
            System.out.print(secondnum+" ");
        }


        for(int i = 2; i < index; i++){
            int result = firstnum + secondnum;
            System.out.print(result+" ");
            firstnum = secondnum;
            secondnum = result;
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in Fibonacci series: ");
        int index = sc.nextInt();

        fibonacci(index);
    }
}
