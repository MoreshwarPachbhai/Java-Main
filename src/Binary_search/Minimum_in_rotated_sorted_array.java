
// Problem Statement:
//Given an integer array arr of size N, sorted in ascending order (with distinct values), the array is rotated at any index which is unknown.
// Find the minimum element in the array.

package Binary_search;

public class Minimum_in_rotated_sorted_array {

    public static int search_min(int[] arr){
        int low = 0;
        int high = arr.length-1;

        while(low < high){
            // finding mid of the array
            int mid = low + (high - low)/2;

            // If mid-element is greater than element at high, min is in right half
            if(arr[mid] > arr[high] ){
                low = mid + 1;
            }

            // arr[mid] <= arr[high] => min is at mid or in left half
            else{
                high = mid;
            }
        }

        // low == high -> index of minimum
        return arr[low];
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};

        int result = search_min(arr);
        System.out.println("The minimum number present in array is: "+result);
    }
}


// *************************************** DRY RUN **************************************************

// Dry run (example) — arr = [4,5,6,7,0,1,2]
//
//low=0, high=6
//
//mid=3 → arr[mid]=7, arr[high]=2 → 7 > 2 → min is right → low = mid+1 = 4
//
//Now low=4, high=6
//
//mid=5 → arr[mid]=1, arr[high]=2 → 1 <= 2 → min is at mid or left → high = mid = 5
//
//Now low=4, high=5
//
//mid=4 → arr[mid]=0, arr[high]=1 → 0 <= 1 → high = mid = 4
//
//Now low=4, high=4 → stop → arr[4] = 0 is min.
