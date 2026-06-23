package Arrays;

// Problem Statement: Given an array of integers and an integer k, return the total number of subarrays whose sum equals k.

public class countSubarraysCountEquals_K {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;

        for(int i = 0; i < arr.length; i++){
            int sum = 0; // reset sum = 0 as loop starts at each time

            for(int j =i; j < arr.length; j++){
                sum += arr[j];

                if(sum == k){

                    System.out.print("[");
                    for(int n = i; n <= j; n++){
                        System.out.print(arr[n]+" ");
                    }

                    System.out.println("]");
                }
            }
        }


    }
}
