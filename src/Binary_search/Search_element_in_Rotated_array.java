
// Problem Statement: Given an integer array nums, sorted in ascending order (with distinct values) and a target value k.
// The array is rotated at some pivot point that is unknown.
// Find the index at which k is present and if k is not present return -1.

package Binary_search;

public class Search_element_in_Rotated_array {

    public static int search(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == target){
                ans = mid;
            }

            // Left half is sorted
            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target <= mid){
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            // Right half is sorted
            else{
                if(arr[mid] <= target && target <= high){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;

        int result = search(arr, target);
        System.out.println("The element found at index: "+ result);
    }
}
