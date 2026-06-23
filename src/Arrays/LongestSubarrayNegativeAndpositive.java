package Arrays;


//Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
// Array contains positive elements and Negative elements

public class LongestSubarrayNegativeAndpositive {
    public static void main(String[] args) {

        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;

        int maxLength = 0;

        for(int i = 0; i < arr.length; i++){
            int sum = 0; // updates sum = 0 after each loop

            for(int j = i; j < arr.length; j++){
                sum += arr[j];

                if(sum == k){               // formula:
                    int length = (j-i)+1; // The length of a subarray (including both start and end) = end index - start index + 1
                    maxLength = Math.max(maxLength,length);
                }
            }
        }

        System.out.println("The maximum length of sub-array with sum "+k+" is: "+ maxLength);
    }
}
