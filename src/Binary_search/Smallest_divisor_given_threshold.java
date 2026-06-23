
// Problem Statement: You are given an array of integers 'arr' and an integer i.e. a threshold value 'limit'.
// Your task is to find the smallest positive integer divisor, such that upon dividing all the elements of the given array by it,
// the sum of the division's result is less than or equal to the given threshold value.

package Binary_search;

public class Smallest_divisor_given_threshold {

    // calculating smallest divisor
    public static int smallestDivisor(int[] arr, int limit){
        int max = getmax(arr);


        for(int divisor = 1; divisor <= max; divisor++){
            int sum = 0;

            for(int num : arr){
                sum += (int) Math.ceil((double) num / divisor);
            }

            if(sum <= limit){
                return divisor;
            }
        }


        return -1;
    }

    // calculating maximum value in array
    public static int getmax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9};
        int limit = 6;

        int result = smallestDivisor(arr, limit);
        System.out.println("Smallest Divisor: " + result);

    }
}
