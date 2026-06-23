package Recursion;

import java.util.Scanner;

public class Reverse_an_Array {

    static void printarr(int[] rev, int len){
        // printing reverse array
        System.out.print("The reverse array is: ");
        for(int i = 0; i < len; i++){
            System.out.print(rev[i]+" ");
        }
    }



    static void reversearr(int [] arr, int len){

        // creating new array to store reverse form of elements
        int[] rev = new int[len];

        // for loop to reverse an array
        for(int i = len - 1; i >= 0; i--){
            rev[len-i-1] = arr[i];
        }

        // calling printarr
        printarr(rev,len);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int len = sc.nextInt();

        // creating an array
        int [] arr = new int[len];

        // taking input in an array
        System.out.println("Enter the elements: ");
        for(int i =0; i < len; i++){
            arr[i] = sc.nextInt();
        }

        // printing original array
        System.out.print("Original array is: ");
        for(int j = 0; j < len; j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println(" ");

        // calling reversearr
        reversearr(arr, len);
    }
}
