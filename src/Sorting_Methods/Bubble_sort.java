package Sorting_Methods;

// Problem Statement: Given an array of N integers, write a program to implement the Bubble Sorting algorithm.

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,1};

        // outer loop
        for(int i =0; i < arr.length-1; i++){
            // inner loop
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
       }
    }
}
