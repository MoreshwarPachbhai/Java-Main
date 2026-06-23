// Problem Statement: Given an integer array arr of size N, sorted in ascending order (may contain duplicate values) and a target value k.
// Now the array is rotated at some pivot point unknown to you.
// Return True if k is present and otherwise, return False.

package Binary_search;

public class Search_element_in_Rotated_array_2 {

    public static boolean search(int[]arr, int k){
        int low =0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == k){
                return true;
            }

            // left sorted array search
            if(arr[low] < arr[mid]){
                if(arr[low] <= k && k < arr[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }

            // Right sorted array search
            else if (arr[mid] < arr[high]) {
                if(arr[mid] < k && k <= arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }

            // if duplicates present (shortening the search window)
            else{
                if(arr[low] == arr[mid]) low++;
                if(arr[mid] == arr[high]) high--;
            }
        }


        return false;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int k = 3; // target

        boolean result = search(arr, k);
        System.out.println(result);

    }
}
