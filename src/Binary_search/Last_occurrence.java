// Problem Statement: Given a sorted array of N integers, write a program to find the index of the last occurrence of the target key.
// If the target is not found then return -1.
// Note: Consider 0 based indexing

package Binary_search;

public class Last_occurrence {

    public static int last(int[]arr, int x){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;

        while(low <= high){
            int mid = (low + high)/2;

            if (arr[mid] == x) {
                ans = mid;      // store this index
                low = mid + 1;  // move RIGHT to find last occurrence
            }

            else if (arr[mid] < x) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 4, 4, 7, 9};
        int x = 4; // target element

        int res = last(arr, x);
        System.out.println("The last occurrence index is: "+ res);
    }
}
