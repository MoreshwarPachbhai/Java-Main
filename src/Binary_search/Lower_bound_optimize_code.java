package Binary_search;

public class Lower_bound_optimize_code {

    public static int lower_bound(int[] arr, int x){
        int low = 0; // starting index
        int high = arr.length-1; // Ending index
        int ans = arr.length; // if index not found

        while(low <= high){

            int mid = (low + high)/2;

            if(arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};  // Sorted array
        int x = 7;// Target value

        int ind = lower_bound(arr, x);
        System.out.println("The index is: "+ ind);
    }
}

