package Arrays;

// Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,3,4,0,5};
        int n = arr.length;

        int [] temp = new int[n];
        int index = 0;

        for(int i =0; i<n; i++){
            if(arr[i] != 0){
                temp[index] = arr[i];
                index++;
            }
        }

        while(index < n){
            temp[index] = 0;
            index++;
        }

        // Step 3: Print result
        System.out.print("Array after moving zeros to end: ");
        for (int num : temp) {
            System.out.print(num + " ");
        }

    }
}
