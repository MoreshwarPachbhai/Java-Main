package Arrays;

// Problem Statement: You are given an array of ‘N’ integers.
// You need to find the length of the longest sequence which contains the consecutive elements.

import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] arr, int n){

        if(n == 0) return 0;

        // Array sort kiya hai
        Arrays.sort(arr);

        int count = 1;
        int longest = 1;

        for(int i =1; i < n; i++){

            if(arr[i] == arr[i-1]+1){
                count++;
            }
            else if (arr[i] == arr[i-1]) {
                continue;
            }
            else {
                // when sequence breaks count stores when compare with longest
                longest = Math.max(longest, count);
                count = 1; // reset count to 1
            }
        }

        // Final check for last sequence
        longest = Math.max(longest, count);

        return longest;

    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        int n = arr.length;

        int result = longestConsecutive(arr, n);
        System.out.println("Longest Consecutive Length: " + result);
    }
}
