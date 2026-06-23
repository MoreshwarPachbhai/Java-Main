
// Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values).
// Now the array is rotated between 1 to N times which is unknown.
// Find how many times the array has been rotated.

package Binary_search;

public class How_many_times_array_rotated_2 {

    public static int search(int[] arr){

        int minval = arr[0];

        int minIndex = 0;


        for(int i = 1; i < arr.length; i++){
            if(arr[i] < minval){
                minval = arr[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};

        int result = search(arr);
        System.out.println("The array is rotated "+result+" times");
    }
}
