
// Problem Statement: Given an array of N integers.
// Every number in the array except one appears twice.
// Find the single number in the array.

package Binary_search;

public class Search_single_element {

    public static int search(int[] arr) {

        int n = arr.length;

        // if only one element is present
        if (n == 1) return arr[0]; // n = 1 is length not index

        for (int i = 0; i < n; i++) {

            // check first element
            if (i == 0) {
                if (arr[i] != arr[i + 1])
                    return arr[i];
            }

            // check last element
            else if (i == n-1) {
                if(arr[i] != arr[i-1]){
                    return arr[i];
                }
            }

            // check middle element
            else{
                if(arr[i] != arr[i-1] && arr[i] != arr[i+1]){
                    return arr[i];
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr ={1,1,2,2,3,3,4,5,5,6,6};

        int result = search(arr);
        System.out.println("The single element is: "+result);
    }
}
