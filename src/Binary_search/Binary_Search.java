package Binary_search;

import java.util.*;

public class Binary_Search {

    public static int search(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){

            int mid =left + (right - left) / 2;

            if(target == arr[mid]){
                return mid;
            }

            else if (target > arr[mid]) {
                left = mid + 1;
            }

            else{
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56};
        int target = 23;

       int result =  search(arr, target);
       if(result == -1){
           System.out.println("The target is not found!");
       }
       else{
           System.out.println("The target number found at index: "+result);
       }

    }
}
