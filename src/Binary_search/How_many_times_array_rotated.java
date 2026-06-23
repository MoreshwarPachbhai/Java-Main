
// Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values).
// Now the array is rotated between 1 to N times which is unknown.
// Find how many times the array has been rotated.

package Binary_search;

public class How_many_times_array_rotated {

    public static int search(int[] arr){

        for(int i = 0; i < arr.length -1; i++){  // taking (arr.length - 1) because for (i = 4) it goes array out of bound index error
            if(arr[i] > arr[i + 1]){ // loop runs only 3 times instead of 4 times

                return i+1; // because indexing starts from 0 not 1
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};

        int result = search(arr);
        System.out.println("The array is rotated "+result+" times");
    }
}
