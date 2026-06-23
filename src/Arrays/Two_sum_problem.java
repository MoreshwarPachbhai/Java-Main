package Arrays;

// Problem Statement: Given an array of integers arr[] and an integer target.
//1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.

import java.util.*;

public class Two_sum_problem {

    public static String two_sum(int n, int[] arr, int target){
        for(int i =0; i < n; i++){
            for(int j=i+1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    return "YES";
                }
            }
        }

        return "No";
    }



    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int n = arr.length;
        int target = 14;
        String result = two_sum(n, arr, target);
        System.out.println("Target found is: "+ result);
    }
}
