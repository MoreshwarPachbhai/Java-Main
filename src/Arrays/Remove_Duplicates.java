package Arrays;

//Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once.
// The relative order of the elements should be kept the same.

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Remove_Duplicates {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,3,4,5,6,7,7};

        LinkedHashSet<Integer> set = new LinkedHashSet<>(); // to maintain order

        // add array elements to LinkedHashSet
        for(int num : arr){
            set.add(num);
        }

        System.out.print(set);
    }
}
