
// Problem Statement: You are given a sorted array arr of distinct values and a target value x.
// You need to search for the index of the target value in the array.
package Binary_search;

public class Search_insert_position {

    public static int position(int[]arr, int x){
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] >= x){
                ans = mid;
                high = mid -1;
            }

            else{
                low = mid + 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int x = 6; // target element to find proper index

        int index = position(arr, x);
        System.out.println("The possible index is: "+ index);
    }
}
