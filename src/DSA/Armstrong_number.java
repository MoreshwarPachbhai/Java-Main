package DSA;

// Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int original = num;
        int count = 0;
        int sum =0;

        // finding digits
        int temp = num;  // temp ke andar num ko store kiya hai to num pr affect nahi hoga only temp gets affected
        while(temp != 0){
            temp = temp / 10;
            count++;
        }

        System.out.println("Number of digits are: "+count);

        // calculating sum of digits raised to the power of digits

        temp = num; // yaha temp mai num ki user defined value aayegi without any changes
        while (temp != 0){
         int digit =  temp % 10;
          sum += Math.pow(digit,count);
          temp = temp / 10;

        }

        if (sum == original)
            System.out.println(true);
        else
            System.out.println(false);

    }
}
