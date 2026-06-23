package Arrays;

//Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
// Array contains only positive elements
public class Longest_Subarray {
    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;

        int maxlength = 0;

        for(int i =0; i < arr.length; i++){
            int sum = 0; // sum gets updated after sum (15) == k (15)

            for(int j = i; j < arr.length; j++){
                sum += arr[j];

                if(sum == k){               // formula :
                    int length = (j-i)+1;  // The length of a subarray (including both start and end) = end index - start index + 1
                    maxlength = Math.max(maxlength,length);
                }
            }
        }

        System.out.println("The maximum length of sub-array is: "+ maxlength);

    }
}
