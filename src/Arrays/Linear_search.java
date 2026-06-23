package Arrays;

// Problem Statement: Given an array, and an element num the task is to find if num is present in the given array or not.
// If present print the index of the element or print -1.


import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        boolean flag = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find: ");
        int num = sc.nextInt();

        for(int i =0; i < arr.length; i++){
            if(arr[i] == num){
                System.out.println("The index is: "+ i);
                flag = true;
                break;
            }
        }

        if(!false){
            System.out.println("-1  -> Number not find!");
        }

    }
}
