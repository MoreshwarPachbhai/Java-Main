package Arrays;

// Problem Statement:
//There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.
// Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.
//Note: Start the array with positive elements.

import java.util.ArrayList;

public class RearrangeElementsBySign {

    public static int[] rearrangeArray(int[] arr, int n){
        int[] ans = new int[n];

        ArrayList<Integer> pos = new ArrayList<>(); // stores positive values
        ArrayList<Integer> neg = new ArrayList<>(); // stores negative values

        for(int num : arr){
            if(num > 0){
                pos.add(num);
            }
            else{
                neg.add(num);
            }
        }

        int posIndex = 0, negIndex = 0;
        for(int i = 0; i < n ; i++){
            if(i % 2 == 0){
                ans[i] = pos.get(posIndex); // stores element at even places
                posIndex++;
            }
            else{
                ans[i] = neg.get(negIndex); // stores element at odd places
                negIndex++;
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, -1, -2, 3};
        int n = arr.length;

        int[] result = rearrangeArray(arr, n);

        System.out.print("Rearranged array: [");
        for (int i =0; i < result.length; i++) {
            System.out.print(result[i] + " ");

            // printing commas(,)
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
