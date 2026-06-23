
// Problem Statement: You are given a sorted array containing N integers and a number X, you have to find the occurrences of X in the given array.

package Binary_search;

public class count_occurrence {

    public static void count_occurrence(int[] arr, int x){
        int count = 0;
        for(int i =0; i < arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        System.out.println("The count is: "+count);
    }

    public static void main(String[] args) {
        int[] arr = {2, 2 , 3 , 3 , 3 , 3 , 4};
        int x = 3;

        count_occurrence(arr, x);

    }
}
