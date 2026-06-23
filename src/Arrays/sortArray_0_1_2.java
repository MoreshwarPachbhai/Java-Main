package Arrays;

// Problem Statement: Given an array consisting of only 0s, 1s, and 2s.
// Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)

import java.util.ArrayList;

public class sortArray_0_1_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        int[] arr = {2,0,2,1,1,0};
        int num = 0;

        for(int i = num ; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == num){
                    list.add(arr[j]);
                }
            }
            if(num == 2) {
                return;
            }
            else{
                num++;
            }
        }

        System.out.println(list);
    }
}
