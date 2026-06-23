
//Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the upper bound of x.

package Binary_search;

public class Upper_Bound {

    public static int upper_bound(int[]arr,int x){
        int low = 0; // starting index
        int high = arr.length - 1; // ending index
        int ans = arr.length; // if target not found

        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] > x){
                ans = mid;
                high = mid - 1;
            }

            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19};  // Sorted array
        int x = 9; // target

        int index = upper_bound(arr, x);
        System.out.println("The index is: "+ index);

    }
}
