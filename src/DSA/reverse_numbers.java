package DSA;

// Problem Statement: Given an integer N return the reverse of the given number.

import java.util.Scanner;

public class reverse_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int lastdigit;
        int answer = 0;

        while(num > 0){
            lastdigit = num % 10;
            answer = answer * 10 + lastdigit;
            num = num / 10;
        }
        System.out.println("The reverse number is: "+ answer);
    }
}
