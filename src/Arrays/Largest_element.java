package Arrays;

// Problem Statement: Given an array, we have to find the largest element in the array.

public class Largest_element {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1,9,6,7,8};
        int maxElement = Integer.MIN_VALUE;

        for(int i =0; i < arr.length; i++){
            if(maxElement < arr[i]){
                maxElement = arr[i];
            }
        }

        System.out.println("Largest Element is: "+maxElement);
    }
}
