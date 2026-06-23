package Arrays;

// Problem Statement: Given an array of integers arr[] and an integer target.
//2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

import java.util.*;

public class two_sum_problem_solution2 {

    public static int[] two_sum(int[] arr, int n, int target){
        int[] ans =new int[2];
        ans[0] = ans[1] = -1;
        for(int i=0; i < n; i++){
            for(int j =i+1; j < n; j++){
                if(arr[i]+arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans; // returning index
                }
            }
        }
            return ans;
    }



    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int n = arr.length;
        int target = 14;

        int[] ans= two_sum(arr, n, target);
        System.out.println("Target found at indexes: "+"[ " + ans[0] + ", " + ans[1] + " ]");
    }
}
