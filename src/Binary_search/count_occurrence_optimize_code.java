
// Problem Statement: You are given a sorted array containing N integers and a number X, you have to find the occurrences of X in the given array.

package Binary_search;

public class count_occurrence_optimize_code {

    // Finding first occurrence
    public static int first_occurrence(int[] arr, int x){
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == x){
                ans = mid;
                high = mid - 1;
            }

            else if (arr[mid] < x) {
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }
        return ans;
    }


    // Finding last occurrence
    public static int last_Occurrence(int[]arr, int x){
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == x){
                ans = mid;
                low = mid + 1;
            }

            else if (arr[mid] < x) {
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }
        return ans;
    }


    public static int countOccurrence(int[]arr, int x){
        if (arr == null || arr.length == 0) return 0;

        int first_index = first_occurrence(arr, x);
        if(first_index == -1) return 0;
        int last_index = last_Occurrence(arr, x);
        if(last_index == -1) return 0;

        return last_index - first_index + 1; // formula to find occurrence
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 3, 3, 4};
        int x = 3; // target element

        int resultcount = countOccurrence(arr, x);
        System.out.println("The count of occurrence is: "+ resultcount);
    }
}
