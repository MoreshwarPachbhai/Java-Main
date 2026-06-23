
// Problem Statement: Given an array of length N, peak element is defined as the element greater than both of its neighbors.
// Formally, if arr[i] is the peak element, arr[i - 1] < arr[i] and arr[i + 1] < arr[i]. Find the index(0-based) of a peak element in the array.
// If there are multiple peak numbers, return the index of any peak number.

package Binary_search;

public class peak_element {

    public static void search_peak(int[] arr){
        int n = arr.length;

        // single element case
        if(n == 1){
            System.out.println("Peak element is: " + arr[0]);
            return;
        }

        for(int i =1; i < n-1;i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                System.out.println("The peak element is: "+ arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,5,1};
        search_peak(arr);
    }
}
