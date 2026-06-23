
// Problem Statement: you're given an sorted array arr of n integers and an integer x.
// Find the floor and ceiling of x in arr[0..n-1]. The floor of x is the largest element in the array which is smaller than or equal to x.
// The ceiling of x is the smallest element in the array greater than or equal to x

package Binary_search;

public class Floor_and_ceil {

    // Finding floor
    public static int floor(int[]arr, int x){
        int low = 0; // starting index
        int high = arr.length - 1; // ending index
        int ans = -1; // if floor not found

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] <= x){
                ans = arr[mid];
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }
        return ans;
    }

    // finding ceiling
    public static int ceil(int[]arr, int x){
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] >= x){
                ans = arr[mid];
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5; // target

        int fres = floor(arr, x);
        int cres = ceil(arr, x);

        System.out.println("The potential floor element is: "+ fres);
        System.out.println("The potential ceil element is: "+cres);
    }
}
