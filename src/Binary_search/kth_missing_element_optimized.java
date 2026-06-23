package Binary_search;

public class kth_missing_element_optimized {

    public static int missing_num(int[] arr, int k){

        int low = 0;
        int high = arr.length-1;

        while (low <= high){
            int mid = low + (high - low)/2;

            int kitne_missing_till_mid = arr[mid] - (mid + 1);

            if(kitne_missing_till_mid < k){
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }

        // when low == high take low or high (imp formula)
        return (low+k);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;

        System.out.println("The k'th missing number is: "+missing_num(arr, k));
    }
}
