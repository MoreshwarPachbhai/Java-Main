package Binary_search;

public class Peak_element_optimized_code {

    public static int search_peak(int[] arr){
        int low = 0;
        int high = arr.length - 1;

        while(low < high){ //  low < high because if low <= high then code crash
            int mid = low + (high - low) / 2;

            if(arr[mid] > arr[mid + 1]){
                // mid can be peak or peak is on left side
                high = mid;
            } else {
                // peak is on right side
                low = mid + 1;
            }
        }

        // when low == high, we found peak
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,5,1};
        int peakIndex = search_peak(arr);

        System.out.println("Peak element: " + arr[peakIndex] + " at index: " + peakIndex);
    }
}
