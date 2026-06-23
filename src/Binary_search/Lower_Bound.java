
// Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the lower bound of x.

package Binary_search;

public class Lower_Bound {

    public static int lower_bound(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= key){
                return i; // First index where element >= key
            }
        }
        return arr.length; // If key is greater than all elements
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int key = 14;
        int index = lower_bound(arr, key);
        System.out.println("The index is: "+ index);
    }
}
