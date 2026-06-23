package Arrays;

// Problem Statement: Given an array of N integers, left rotate the array by one place.

public class Left_rotate_array {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        int temp = arr[0];

        for(int i =1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length -1] = temp;

        System.out.print("Left rotated array is: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

}
