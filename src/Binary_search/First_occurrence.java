
// Problem Statement:
//You are given a sorted array of N integers (which may contain duplicate values) and a target value x.
//Your task is to find the index of the first (leftmost) occurrence of the target value in the array.
//If the target value does not appear in the array, return -1.

package Binary_search;

public class First_occurrence {

    public static int first(int[]arr, int x){
        int low = 0; // starting index
        int high = arr.length - 1; // ending index
        int ans = -1; // if not found

        while(low <= high){
            int mid = (low + high)/2;

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

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 7, 9};
        int x = 4;

        int res = first(arr, x);
        System.out.println("The index of first occurrence is: "+ res);

    }
}
